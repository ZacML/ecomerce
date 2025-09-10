package com.ecomerce.poo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public record ClienteDto(
        @NotBlank(message = "Não é possivel cadastrar o cliente com espaço em branco!")
        @NotNull(message = "Não é possivel cadastrar o cliente sem nome!")
        @Size(min = 3, max = 100)
        String nmCliente,

        @NotNull(message = "Não é possível cadastrar cliente sem telefone!")
        @Size(min = 8, max = 11)
        String tlCliente,

        @NotNull(message = "Não é possível cadastrar o cliente sem idade!")
        Integer idadeCliente,

        @NotNull(message = "Não é possivel cadasrtar o funcionário com altura vazia!\n" +
                "(Coloque em centimetros!)")
        @Size(min = 2, max = 100, message = "Favor informar uma altura entre 2 digitos ou mais, coloque em centímetros!" )
        Integer alturaCliente,

        @NotBlank(message = "Não é possível cadastrar o funcionario sem um endereço!\n" +
                "(Coloque sua rua como endereço!)")
        String enderecoCliente

) {
}
