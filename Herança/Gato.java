package Herança;

public class Gato extends Animal{
    String expressar;
    String regiao;
    public String getExpressar() {
        return expressar;
    }

    public void setExpressar(String expressar) {
        this.expressar = expressar;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }


    public Gato(String expressar, String regiao) {
        this.expressar = expressar;
        this.regiao = regiao;
    }
}