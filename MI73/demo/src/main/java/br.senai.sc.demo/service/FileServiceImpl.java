package br.senai.sc.demo.service;

import br.senai.sc.demo.controller.dto.FileRequestPostDTO;
import br.senai.sc.demo.model.File;
import br.senai.sc.demo.model.Task;
import br.senai.sc.demo.repository.FileRepository;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.event.S3EventNotification;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@Service
public class FileServiceImpl implements FileServiceInt {
    @Autowired
    private FileRepository fileRepository;

    @Value("${aws.access.key}")
    private String awsKeyId;
    @Value("${aws.access.secret.key}")
    private String awsKeySecret;
    @Value("${aws.bucket.name}")
    private String bucketName;


    @Override
    public boolean criar(Long id, MultipartFile file) {
        try {
            File novoFile = new File();
            String urlAws = UUID.randomUUID().toString();
            novoFile.setUrl(urlAws);
            novoFile.setTask(new Task(id));
            fileRepository.save(novoFile);

            AWSCredentials awsCredentials = new BasicAWSCredentials(awsKeyId, awsKeySecret);

            AmazonS3 client = AmazonS3ClientBuilder.standard().withCredentials(
                    new AWSStaticCredentialsProvider(awsCredentials))
                    .withRegion(Regions.US_EAST_1).build();

            boolean bucketExist = client.doesBucketExistV2(bucketName);

            if (!bucketExist){
                System.out.println("Não existe");
            } else {
                System.out.println("existe");
            }

            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.setContentType(file.getContentType());
            objectMetadata.setContentLength(file.getSize());
            client.putObject(bucketName, urlAws, file.getInputStream(), objectMetadata);

            return true;

        } catch (AmazonS3Exception e){
            System.out.println(e.getMessage());
            return false;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public String buscarFile(Integer id) {
        try{
            Optional<File> fileOptional = fileRepository.findById(id);

            if (fileOptional.isEmpty()){
                return null;
            }

            File file = fileOptional.get();

            AWSCredentials awsCredentials = new BasicAWSCredentials(awsKeyId, awsKeySecret);

            AmazonS3 client = AmazonS3ClientBuilder.standard().withCredentials(
                            new AWSStaticCredentialsProvider(awsCredentials))
                    .withRegion(Regions.US_EAST_1).build();

            boolean bucketExist = client.doesBucketExistV2(bucketName);

            if (!bucketExist){
                System.out.println("Não existe");
            } else {
                System.out.println("existe");
            }
             Task task = new Task();

            GeneratePresignedUrlRequest presigned =
                    new GeneratePresignedUrlRequest(bucketName, file.getUrl());
            presigned.setExpiration(new Date(System.currentTimeMillis() + 600000));

            return client.generatePresignedUrl(presigned).toString();

        } catch (AmazonS3Exception e){
            return e.getMessage();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }

    @Override
    public List<String> buscarImagens(Long id) {
        List<String> urls = new ArrayList<>();
        try {
            List<File> files = fileRepository.findAllByTask_Id(id);

            if (files.isEmpty()) {
                return urls;
            }

            AWSCredentials awsCredentials = new BasicAWSCredentials(awsKeyId, awsKeySecret);

            AmazonS3 client = AmazonS3ClientBuilder.standard().withCredentials(
                            new AWSStaticCredentialsProvider(awsCredentials))
                    .withRegion(Regions.US_EAST_1).build();

            boolean bucketExist = client.doesBucketExistV2(bucketName);

            if (!bucketExist) {
                System.out.println("Bucket não existe");
            } else {
                System.out.println("Bucket existe");
            }

            for (File file : files) {
                GeneratePresignedUrlRequest presigned =
                        new GeneratePresignedUrlRequest(bucketName, file.getUrl());
                presigned.setExpiration(new Date(System.currentTimeMillis() + 600000));

                String url = client.generatePresignedUrl(presigned).toString();
                urls.add(url);
            }

        } catch (AmazonS3Exception e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return urls;
    }
}
