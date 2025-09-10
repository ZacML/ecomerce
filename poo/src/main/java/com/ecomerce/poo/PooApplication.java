package com.ecomerce.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PooApplication {


    public static void main(String[] args) {
        SpringApplication.run(PooApplication.class, args);
    }
/*

GET BUSCAR AS INFORMAÇÕES OU PEGAR
POST ENVIAR AS INFORMAÇÕES OU EMPURRAR
PUT ALTERAR AS INFORMAÇÕES
PATCH ALTERAR AS INFORMAÇÕES
DELETE DELETAR OU APAGAS INFORMAÇÕES
 */



    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
