package com.ecomerce.poo.repository;

import com.ecomerce.poo.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
    Optional<ProdutoModel> findByCdProduto(Long cdProduto);
    List<ProdutoModel> findByNmProduto(String nmProduto);
    Optional<ProdutoModel> findAllByCdProduto(Long cdProduto);
}
