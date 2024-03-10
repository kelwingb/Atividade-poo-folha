package Desafio;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        System.out.println("Área do circulo é: " + circulo.area());

        Retangulo retangulo = new Retangulo(8,9);
        System.out.println("Área do Retângulo é: " + retangulo.area());

        Triangulo triangulo = new Triangulo(3,3);
        System.out.println("Área do Triãngulo é: " + triangulo.area());
    }
}
