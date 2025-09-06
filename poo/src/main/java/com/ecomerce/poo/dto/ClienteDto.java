package com.ecomerce.poo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record ClienteDto(
        @NotBlank(message = "Não é possivel cadastrar o cliente sem nome!")
        String nmCliente,

        @NotBlank(message = "Não é possível cadastrar cliente sem telefone!")
        String tlFuncionario,

        @NotNull(message = "Não é possível cadastrar o cliente sem idade!")
        int idadeCliente,

        @NotNull(message = "Não é possivel cadasrtar o funcionário sem altura!\n" +
                "(Coloque em centimetros!)")
        int alturaCliente,

        @NotBlank(message = "Não é possível cadastrar o funcionario sem um endereço!\n" +
                "(Coloque sua rua como endereço!)")
        String enderecoCliente

) {
}
