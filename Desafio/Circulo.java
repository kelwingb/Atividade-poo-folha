package Desafio;

public class Circulo extends Geometria{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
