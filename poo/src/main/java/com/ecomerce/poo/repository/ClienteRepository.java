package com.ecomerce.poo.repository;

import com.ecomerce.poo.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel,Long>{
    Optional<ClienteModel> findByCdCliente(Long cdCliente);
    Optional<ClienteModel> findAllByCdCliente(Long cdCliente);
    List<ClienteModel> findByNmCliente(String nmCliente);
}
