package com.example.BackEndECommerce.controller;

import com.example.BackEndECommerce.persistence.entities.Produto;
import com.example.BackEndECommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> getProdutos(){
        return service.listarProdutos();
    }

    @GetMapping("/{id}")
    public Produto getProdutoId(@PathVariable Integer id){
        return service.buscarProdutoId(id);
    }
}
