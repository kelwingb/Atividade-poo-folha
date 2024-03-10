package Herança;

public class Carro extends Veiculo{

    boolean cambio;
    boolean quatroRodas;
    boolean eletrico;
    int qtdAcentos;
    int qtdPortas;
    double combustLitros;
    boolean conversivel;

    public Carro(boolean cambio, boolean quatroRodas, boolean eletrico, int qtdAcentos, int qtdPortas, double combustLitros, boolean conversivel) {
        this.cambio = cambio;
        this.quatroRodas = quatroRodas;
        this.eletrico = eletrico;
        this.qtdAcentos = qtdAcentos;
        this.qtdPortas = qtdPortas;
        this.combustLitros = combustLitros;
        this.conversivel = conversivel;
    }

    public boolean isCambio() {
        return cambio;
    }

    public void setCambio(boolean cambio) {
        this.cambio = cambio;
    }

    public boolean isQuatroRodas() {
        return quatroRodas;
    }

    public void setQuatroRodas(boolean quatroRodas) {
        this.quatroRodas = quatroRodas;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

    public int getQtdAcentos() {
        return qtdAcentos;
    }

    public void setQtdAcentos(int qtdAcentos) {
        this.qtdAcentos = qtdAcentos;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public double getCombustLitros() {
        return combustLitros;
    }

    public void setCombustLitros(double combustLitros) {
        this.combustLitros = combustLitros;
    }

    public boolean isConversivel() {
        return conversivel;
    }

    public void setConversivel(boolean conversivel) {
        this.conversivel = conversivel;
    }
}
