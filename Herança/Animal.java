package Herança;

public class Animal {
    private String origem;
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public Animal() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
