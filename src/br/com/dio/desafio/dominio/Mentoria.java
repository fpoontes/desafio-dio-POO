package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String Titulo;
    private String Descrição;
    private LocalDate Data;

    public Mentoria() {

    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String descrição) {
        Descrição = descrição;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + Titulo + '\'' +
                ", Descrição='" + Descrição + '\'' +
                ", Data=" + Data +
                '}';
    }
}
