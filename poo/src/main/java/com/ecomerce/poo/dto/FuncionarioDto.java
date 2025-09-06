package com.ecomerce.poo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDto(
        @NotBlank(message = "Não é possivel cadastrar o funcionario sem nome!")
        String nmFuncionario,

        @NotBlank(message = "Não é possível cadastrar funcionario sem telefone!")
        String tlFuncionario,

        @NotNull(message = "Não é possivel cadastrar o funcionarui com o campo vazio!")
        @DecimalMin(value = "0.01",
                message = "Não é possivel cadastrar o funcionário com salário abaixo de 0.01!")
        double vlProduto
) {
}

