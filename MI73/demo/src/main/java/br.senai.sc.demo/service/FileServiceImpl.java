package br.senai.sc.demo.service;

import br.senai.sc.demo.controller.dto.FileRequestPostDTO;
import br.senai.sc.demo.model.File;
import br.senai.sc.demo.model.Task;
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
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
public class FileServiceImpl implements FileServiceInt {
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

            return true;

        } catch (AmazonS3Exception e){
            System.out.println(e.getMessage());
            return false;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
