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
    private Long cdCliente;
    @Column(name = "NMFUNCIONARIO")
    private String nmCliente;
    @Column(name = "TLCLIENTE")
    private String tlCliente;
    @Column(name = "IDADECLIENTE")
    private Integer idadeCliente;
    @Column(name = "ALTURACLIENTE")
    private Integer alturaCliente;
    @Column(name = "ENDERECOCLIENTE")
    private String enderecoCliente;

}
