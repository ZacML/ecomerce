package com.ecomerce.poo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBFUNCIONARIO")

public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDFUNCIONARIO")
    private Long cdFuncionario;
    @Column(name = "NMFUNCIONARIO")
    private String nmFuncionario;
    @Column(name = "TLFUNCIONARIO")
    private String tlFuncionario;
    @Column(name = "SALFUNCIONARIO")
    private Double salFuncionario;
}
