package com.ecomerce.poo.repository;

import com.ecomerce.poo.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    Optional<FuncionarioModel> findByCdFuncionario(Long cdFuncionario);
    List<FuncionarioModel> findByNmFuncionario(String nmFuncionario);
    Optional<FuncionarioModel> findAllByCdFuncionario(Long cdFuncionario);

}
