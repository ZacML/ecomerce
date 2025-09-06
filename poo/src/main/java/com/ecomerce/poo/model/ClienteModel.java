package com.ecomerce.poo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBCLIENTE")

public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDCLIENTE")
    private int cdCliente;
    @Column(name = "NMFUNCIONARIO")
    private String nmFuncionário;
    @Column(name = "TLCLIENTE")
    private String tlCliente;
    @Column(name = "IDADECLIENTE")
    private int idadeCliente;
    @Column(name = "ALTURACLIENTE")
    private int alturaCliente;
    @Column(name = "ENDERECOCLIENTE")
    private String enderecoCliente;

}
