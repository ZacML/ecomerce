package com.ecomerce.poo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDto(
        @NotBlank(message = "Não é possivel cadastrar o produto sem nome!")
        String nmProduto,
        String dsProduto,

        @NotNull(message = "Não é possivel cadastrar o produto com o campo vazio!")
        @DecimalMin(value = "0.01",
                message = "Não é possivel cadastrar o produto com valor abaixo de 0.01!")
        Double vlProduto,

        @NotNull(message = "Não é possivel cadastrar o produto com o flag vazia!")
        @NotBlank(message = "Não é possibel cadastrar o produto com a flag em branco!")
        String flAtivo
) {
}
