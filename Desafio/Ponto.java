package Desafio;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double deltaX = this.x - outroPonto.x;
        double deltaY = this.y - outroPonto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }


    public static void main(String[] args) {

        Ponto pontoA = new Ponto(7.0, 1.0);
        Ponto pontoB = new Ponto(8.0, 3.0);

        double distanciaAB = pontoA.calcularDistancia(pontoB);
        System.out.println("A distância entre os pontos A e B é: " + distanciaAB);
    }
}
