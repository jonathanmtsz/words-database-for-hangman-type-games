package com.jntn11.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuarios")
public class Palavra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(unique = true, nullable = false, name = "palavra")
    String palavra;

    @Column(nullable = false, name = "dificuldade")
    Integer dificuldade;


}
