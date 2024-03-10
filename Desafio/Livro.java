package Desafio;

public class Livro {
    private String autor;
    private int dataPublicada;
    private String titulo;

    public Livro(String autor, int dataPublicada, String titulo) {
        this.autor = autor;
        this.dataPublicada = dataPublicada;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }


    public int getDataPublicada() {
        return dataPublicada;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + "Autor: " + autor + "Data Publicada: " + dataPublicada;
    }
}