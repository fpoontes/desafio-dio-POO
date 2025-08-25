import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHorária(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHorária(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devGabi = new Dev();
        devGabi.setNome("Gabi");
        devGabi.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos" + devGabi.getConteudosInscritos());
        devGabi.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devGabi.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devGabi.getConteudosConcluidos());
        System.out.println("XP:" + devGabi.calcularXp());


        System.out.println("-------");


        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devFelipe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devFelipe.getConteudosConcluidos());
        System.out.println("XP:" + devFelipe.calcularXp());


        }
    }