package com.integracao.msintegracao.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Cliente {
    private Integer id;
    private String nome;
    private Integer idade;
    private String cpf;
    private LocalDateTime registrationDate;
}
