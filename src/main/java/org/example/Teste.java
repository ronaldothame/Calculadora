package org.example;

public class Teste {
    public static void main(String[] args) {
        // Cenário de teste 1: Soma de dois valores:
        double soma = Soma.somar(3,7);
        System.out.println(soma);

        // Cenário de teste 2: Soma de dois valores sendo um zero:
        soma = Soma.somar(3,0);
        System.out.println(soma);

        // Cenário de teste 3: Soma de dois valores sendo que ambos são zero:
        soma = Soma.somar(0,0);
        System.out.println(soma);

        // Cenário de teste 4: Soma de dois valores sendo um negativo:
        soma = Soma.somar(3,-1);
        System.out.println(soma);

        // Cenário de teste 5: Subtração de dois valores:
        double subtracao = Subtracao.subtrair(10, 7);
        System.out.println(subtracao);

        // Cenário de teste 6: Subtração de dois valores sendo um zero:
        subtracao = Subtracao.subtrair(3, 0);
        System.out.println(subtracao);

        // Cenário de teste 7: Subtração de dois valores sendo que ambos são zero:
        subtracao = Subtracao.subtrair(0, 0);
        System.out.println(subtracao);

        // Cenário de teste 8: Subtração de dois valores sendo um negativo:
        subtracao = Subtracao.subtrair(3, -1);
        System.out.println(subtracao);

        // Cenário de teste 9: Multiplicação de dois valores
        double multiplicacao = Multiplicacao.multiplicar(3, 7);
        System.out.println(multiplicacao);

        // Cenário de teste 10: Multiplicação de dois valores sendo um zero
        multiplicacao = Multiplicacao.multiplicar(3, 0);
        System.out.println(multiplicacao);

        // Cenário de teste 11: Multiplicação de dois valores sendo que ambos são zero
        multiplicacao = Multiplicacao.multiplicar(0, 0);
        System.out.println(multiplicacao);

        // Cenário de teste 12: Multiplicação de dois valores sendo um negativo
        multiplicacao = Multiplicacao.multiplicar(3, -1);
        System.out.println(multiplicacao);

        // Cenário de teste 13: Divisão de dois valores
        double divisao = Divisao.dividir(10, 2);
        System.out.println(divisao);

        // Cenário de teste 14: Divisão de dois valores sendo um zero
        divisao = Divisao.dividir(3, 0);
        System.out.println(divisao);

        // Cenário de teste 15: Divisão de dois valores sendo que ambos são zero
        divisao = Divisao.dividir(0, 0);
        System.out.println(divisao);

        // Cenário de teste 16: Divisão de dois valores sendo um negativo
        divisao = Divisao.dividir(10, -2);
        System.out.println(divisao);

    }
}