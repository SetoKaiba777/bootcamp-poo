package com.kaibacorp.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {;
        Curso curso1 = new Curso("Curso Java",8,"descrição curso de Java");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria("Mentoria Java", LocalDate.now(),"descriçao mentoria");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev caio = new Dev("Caio");
        caio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Caio: ");
        for (Conteudo conteudo : caio.getConteudosInscritos()){
            System.out.println(conteudo);
        }

        Dev camila = new Dev("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos Camila: ");
        for (Conteudo conteudo : camila.getConteudosInscritos()){
            System.out.println(conteudo);
        }

        caio.progredir();
        System.out.println("\nConteúdos Concluidos Caio: ");
        for (Conteudo conteudo : caio.getConteudosConcluidos()){
            System.out.println(conteudo);
        }

        camila.progredir();
        camila.progredir();
        System.out.println("\nConteúdos concluidos Camila: ");
        for (Conteudo conteudo : camila.getConteudosConcluidos()){
            System.out.println(conteudo);
        }

        System.out.println("\nConteúdos inscritos Caio: ");
        for (Conteudo conteudo : caio.getConteudosInscritos()){
            System.out.println(conteudo);
        }

        System.out.println("\nConteúdos inscritos Camila: ");
        for (Conteudo conteudo : camila.getConteudosInscritos()){
            System.out.println(conteudo);
        }

        System.out.println("\nExibir xp Caio: "+caio.calcularTotalXp());
        System.out.println("\nExibir xp Camila: "+camila.calcularTotalXp());
    }
}
