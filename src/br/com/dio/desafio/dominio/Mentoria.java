package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate Data;

    @Override
    public double calcularXp() {
        return XP_PADRÃO + 20D;
    }

    public Mentoria() {

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
                "Titulo='" + getTitulo() + '\'' +
                ", Descrição='" + getDescricao() + '\'' +
                ", Data=" + Data +
                '}';
    }
}
