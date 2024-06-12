package br.senai.sc.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

//A notação Getter cria um método get() para todos os atributos da classe
@Getter

//Gera um ToString com todos os atributos (a notação ToString.Exclude faz com que o atributo seja ignorado)
@ToString

//Esteriótipo que permite que o Spring assimile a classe com uma tabela que sera criada no banco de dados
@Entity
//Table serve para definir um nome para a tabela no banco, senão usará o nome da classe
//@Table(name = "tb_usuario")
public class Usuario {

    //Column serve para definir inúmeras características dos atributos na hora que eles são
    //criados no banco, EX:
    //@Column(name = "cpf_usuario", length = 50, unique = true, nullable = false)
    @Id //Indica que o seguinte atributo será a primary key da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(precision = 11, updatable = false,  unique = true)
    private Long cpf;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String email;
    @ToString.Exclude // Faz com que o ToString ignore o atributo senha e não printe ele
    @Column(name = "password")
    private String senha;
    @Column(length = 50)
    private String nomePet;
}
