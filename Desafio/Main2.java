package Desafio;

public class Main2 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Quixote", 1605, "Miguel de Cervantes");
        Livro livro2 = new Livro("A Divina Comédia", 1320, "Dante Alighieri");

        Usuario usuario1 = new Usuario("João",30,75,1.70 );
        Usuario usuario2 = new Usuario("Maria", 25,80,1.90);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        biblioteca.mostrarLivros();
        biblioteca.mostrarUsuarios();
    }
}