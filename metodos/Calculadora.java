package BootcampJavaDIO.metodos;

public class Calculadora {

    public static void soma(int numero1, int numero2) {
        int resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }
    
    public static void subtracao(int numero1, int numero2) {
        int resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " mais " + numero2 + " é " + resultado);
    }
    
    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;

        System.out.println("A multiplicacao de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;

        System.out.println("A divisao de " + numero1 + " mais " + numero2 + " é " + resultado);
    }
    
}
