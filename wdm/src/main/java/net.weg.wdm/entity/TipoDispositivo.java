package net.weg.wdm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TipoDispositivo {
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(nullable = false, unique = true, length = 50)
   private String nome;
}
