package Desafio;

public class Usuario {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Usuario(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Usuario: " + nome + '\'' + "idade: " + idade + "peso: " + peso + "altura: " + altura;
    }
}