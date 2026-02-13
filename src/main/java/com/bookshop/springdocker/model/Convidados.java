package com.bookshop.springdocker.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Convidados {
    private long id;
    private String nome;
    private String cpf;
}
