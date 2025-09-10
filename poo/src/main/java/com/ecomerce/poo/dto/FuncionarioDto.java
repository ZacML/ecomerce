package com.ecomerce.poo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDto(
        @NotBlank@NotNull(message = "O nome do funcionário precisa ser preenchido!")
        String nmFuncionario,

        @NotBlank(message = "O número do telegone precisa ser preenchido!")
        String tlFuncionario,

        @NotNull(message = "O salario precisa ser preenchido" +
                "!")
        @DecimalMin(value = "1518.0",
                message = "Não é possivel cadastrar o funcionário com salário abaixo de 0.01!")
        Double salFuncionario
) {
}

