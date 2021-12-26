package com.kaibacorp.dominio;

public class Curso extends Conteudo {

    private Integer cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO*cargaHoraria;
    }

    public Curso(String titulo, Integer cargaHoraria, String descricao) {
        super(titulo,descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", descricao='" + this.getDescricao() + '\'' +
                '}';
    }
}
