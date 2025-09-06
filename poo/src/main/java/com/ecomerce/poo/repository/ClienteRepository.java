package com.ecomerce.poo.repository;

import com.ecomerce.poo.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel,Integer>{
    Optional<ClienteModel> findByCdCliente(int cdCliente);
    Optional<ClienteModel> findByNmCliente(String nmCliente);
    Optional<ClienteModel> findAllByCdCliente(int cdCliente);
}
