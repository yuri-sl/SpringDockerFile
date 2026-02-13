package com.bookshop.springdocker.Controller;

import com.bookshop.springdocker.model.Convidados;
import com.bookshop.springdocker.repository.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")//Permite que essa API receba comunicação de outros domínios
public class ConvidadosController {

    //Provem uma instancia do ConvidadosRepository
    @Autowired
    private ConvidadosRepository convidadosRepository;

    @GetMapping()
    public List<Convidados> getConvidados(){
        return convidadosRepository.findAll();
    }

    /*
    @GetMapping
    public List<Convidados> getConvidados(){
        List<Convidados> lista = new ArrayList<Convidados>();
        lista.add(Convidados.builder()
                .id(1).nome("Goku").cpf("111.111.111-11").build());
        lista.add(Convidados.builder()
                .id(2).nome("Vegeta").cpf("222.222.222-22").build());
        return lista;
    }
    */

}
