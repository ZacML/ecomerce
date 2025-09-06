package com.ecomerce.poo.controller;


import com.ecomerce.poo.dto.FuncionarioDto;
import com.ecomerce.poo.model.FuncionarioModel;
import com.ecomerce.poo.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/funcionario")

public class FuncionarioController {
    @Autowired
    FuncionarioRepository funcionarioRepository;

    @PostMapping
    public ResponseEntity<FuncionarioModel> CriarFuncionario(@Valid @RequestBody FuncionarioDto funcionarioDto) {
        var funcionarioModel = new FuncionarioModel();
        BeanUtils.copyProperties(funcionarioDto, funcionarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioRepository.save(funcionarioModel));
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> ListarFuncionarios() {
        return ResponseEntity.status(
                HttpStatus.OK).body(funcionarioRepository.findAll());
    }
}
