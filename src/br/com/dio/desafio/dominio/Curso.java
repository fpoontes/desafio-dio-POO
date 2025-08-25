package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int CargaHorária;

    @Override
    public double calcularXp() {
        return XP_PADRÃO * CargaHorária;
    }

    public Curso() {

    }


    public int getCargaHorária() {
        return CargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        CargaHorária = cargaHorária;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descrição='" + getDescricao() + '\'' +
                ", CargaHorária=" + CargaHorária +
                '}';
    }
}
