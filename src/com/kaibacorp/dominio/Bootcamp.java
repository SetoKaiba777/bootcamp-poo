package com.kaibacorp.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Dev> devs = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = LocalDate.now().plusDays(45);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDevs(), bootcamp.getDevs()) && Objects.equals(getConteudos(), bootcamp.getConteudos()) && Objects.equals(getDataInicial(), bootcamp.getDataInicial()) && Objects.equals(getDataFinal(), bootcamp.getDataFinal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDevs(), getConteudos(), getDataInicial(), getDataFinal());
    }
}
