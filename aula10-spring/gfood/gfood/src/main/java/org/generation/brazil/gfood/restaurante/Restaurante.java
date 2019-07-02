package org.generation.brazil.gfood.restaurante;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Data
@Entity
@Table(name = "restaurante")
public class Restaurante {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        private String nome;

        private String endereco;


    }


