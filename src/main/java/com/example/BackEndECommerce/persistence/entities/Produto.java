package com.example.BackEndECommerce.persistence.entities;

import javax.persistence.*;

@Entity
public class Produto {
    @Id
    @SequenceGenerator(name = "produto_sequencia", sequenceName = "produto_sequencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_sequencia")
    private Integer id;
    private String nome;
    private Double valor;
    private String descricao;
    private String imagem;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}
