package br.com.dio.desafio.dominio;

public class Curso {
    private String Titulo;
    private String Descrição;
    private int CargaHorária;

    public Curso() {

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

    public int getCargaHorária() {
        return CargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        CargaHorária = cargaHorária;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + Titulo + '\'' +
                ", Descrição='" + Descrição + '\'' +
                ", CargaHorária=" + CargaHorária +
                '}';
    }
}
