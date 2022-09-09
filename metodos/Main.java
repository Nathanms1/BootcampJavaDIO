package BootcampJavaDIO.metodos;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 12);
        Calculadora.multiplicacao(10, 3);
        Calculadora.divisao(84, 12);
    
        //Mensagem
        System.out.println("\n" + "Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(4);

        //Emprestimo
        System.out.println("\n" + "Exercicio Emprestimo");
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());

    }
}