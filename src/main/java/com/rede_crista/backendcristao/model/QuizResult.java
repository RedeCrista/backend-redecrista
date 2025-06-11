package com.rede_crista.backendcristao.model;

import jakarta.persistence.*;

@Entity
public class QuizResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeUsuario;
    private String resultadoDiscípulo;

    public QuizResult() {}

    public QuizResult(String nomeUsuario, String resultadoDiscípulo) {
        this.nomeUsuario = nomeUsuario;
        this.resultadoDiscípulo = resultadoDiscípulo;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getResultadoDiscípulo() {
        return resultadoDiscípulo;
    }

    public void setResultadoDiscípulo(String resultadoDiscípulo) {
        this.resultadoDiscípulo = resultadoDiscípulo;
    }
}
