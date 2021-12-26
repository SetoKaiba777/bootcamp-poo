package com.kaibacorp.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO+20d;
    }

    public Mentoria(String titulo, LocalDate data, String descricao) {
        super(titulo, descricao);
        this.data = data;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Mentoria{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", data=" + formatter.format(data) +
                ", descricao='" + this.getDescricao() + '\'' +
                '}';
    }
}
