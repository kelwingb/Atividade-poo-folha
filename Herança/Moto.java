package Herança;

public class Moto extends Veiculo{
    boolean duasRodas;
    boolean eletrica;
    int qtdFarol;
    int qtdEscape;
    boolean eletrico;

    public Moto(boolean duasRodas, boolean eletrica, int qtdFarol, int qtdEscape, boolean eletrico) {
        this.duasRodas = duasRodas;
        this.eletrica = eletrica;
        this.qtdFarol = qtdFarol;
        this.qtdEscape = qtdEscape;
        this.eletrico = eletrico;
    }

    public boolean isDuasRodas() {
        return duasRodas;
    }

    public void setDuasRodas(boolean duasRodas) {
        this.duasRodas = duasRodas;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    public int getQtdFarol() {
        return qtdFarol;
    }

    public void setQtdFarol(int qtdFarol) {
        this.qtdFarol = qtdFarol;
    }

    public int getQtdEscape() {
        return qtdEscape;
    }

    public void setQtdEscape(int qtdEscape) {
        this.qtdEscape = qtdEscape;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }
}
