package com.example.BackEndECommerce.service;

import com.example.BackEndECommerce.persistence.entities.Produto;
import com.example.BackEndECommerce.persistence.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listarProdutos(){
        return repository.findAll();
    }

    public Produto buscarProdutoId(Integer id){
        return repository.findById(id).get();
    }

    public Produto criarProduto(Produto produto){
        return repository.save(produto);
    }

    public void deletarProduto(Integer id){
        repository.deleteById(id);
    }

    public Produto editarProduto(Produto produto){
        Produto produtoEditar = repository.findById(produto.getId()).get();
        if (produto.getCategoria() != null)
            produtoEditar.setCategoria(produto.getCategoria());
        if (produto.getDescricao() != null)
            produtoEditar.setDescricao(produto.getDescricao());
        if (produto.getImagem() != null)
            produtoEditar.setImagem(produto.getImagem());
        if (produto.getValor() != null)
            produtoEditar.setValor(produto.getValor());
        return repository.save(produtoEditar);
    }
}
