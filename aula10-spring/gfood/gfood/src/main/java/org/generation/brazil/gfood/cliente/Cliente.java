package org.generation.brazil.gfood.cliente;



import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.time.LocalDate;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;


@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    private String endereco;

    @NotNull
    @Column(name = "data_nasc")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNasc;


    }
