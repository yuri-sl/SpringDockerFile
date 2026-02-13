package com.bookshop.springdocker.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Convidados {
    @Id
    @Column
    private long id;
    @Column
    private String nome;
    @Column
    private String cpf;
}
