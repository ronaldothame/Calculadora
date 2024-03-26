package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraJunitTest {
    // Cenário de teste 1: Soma de dois valores
    @Test
    public void testSoma() {
        double resultado = Soma.somar(3, 7);
        Assertions.assertEquals(10, resultado);
    }

    // Cenário de teste 2: Soma de dois valores sendo um zero
    @Test
    public void testSomaZero() {
        double resultado = Soma.somar(3, 0);
        Assertions.assertEquals(3, resultado);
    }

    // Cenário de teste 3: Soma de dois valores sendo que ambos são zero
    @Test
    public void testSomaAmbosZero() {
        double resultado = Soma.somar(0, 0);
        Assertions.assertEquals(0, resultado);
    }

    // Cenário de teste 4: Soma de dois valores sendo um negativo
    @Test
    public void testSomaNegativo() {
        double resultado = Soma.somar(3, -1);
        Assertions.assertEquals(2, resultado);
    }

    // Cenário de teste 5: Subtração de dois valores
    @Test
    public void testSubtracao() {
        double resultado = Subtracao.subtrair(10, 7);
        Assertions.assertEquals(3, resultado);
    }

    // Cenário de teste 6: Subtração de dois valores sendo um zero
    @Test
    public void testSubtracaoZero() {
        double resultado = Subtracao.subtrair(3, 0);
        Assertions.assertEquals(3, resultado);
    }

    // Cenário de teste 7: Subtração de dois valores sendo que ambos são zero
    @Test
    public void testSubtracaoAmbosZero() {
        double resultado = Subtracao.subtrair(0, 0);
        Assertions.assertEquals(0, resultado);
    }

    // Cenário de teste 8: Subtração de dois valores sendo um negativo
    @Test
    public void testSubtracaoNegativo() {
        double resultado = Subtracao.subtrair(3, -1);
        Assertions.assertEquals(4, resultado);
    }

    // Cenário de teste 9: Multiplicação de dois valores
    @Test
    public void testMultiplicacao() {
        double resultado = Multiplicacao.multiplicar(3, 7);
        Assertions.assertEquals(21, resultado);
    }

    // Cenário de teste 10: Multiplicação de dois valores sendo um zero
    @Test
    public void testMultiplicacaoZero() {
        double resultado = Multiplicacao.multiplicar(3, 0);
        Assertions.assertEquals(0, resultado);
    }

    // Cenário de teste 11: Multiplicação de dois valores sendo que ambos são zero
    @Test
    public void testMultiplicacaoAmbosZero() {
        double resultado = Multiplicacao.multiplicar(0, 0);
        Assertions.assertEquals(0, resultado);
    }

    // Cenário de teste 12: Multiplicação de dois valores sendo um negativo
    @Test
    public void testMultiplicacaoNegativo() {
        double resultado = Multiplicacao.multiplicar(3, -1);
        Assertions.assertEquals(-3, resultado);
    }

    // Cenário de teste 13: Divisão por um valor positivo
    @Test
    public void testDivisao() {
        double resultado = Divisao.dividir(10, 2);
        Assertions.assertEquals(5, resultado);
    }

    // Cenário de teste 14: Divisão por zero
    @Test
    public void testDivisaoZero() {
        double resultado = Divisao.dividir(3, 0);
        Assertions.assertEquals(Double.NaN, resultado);
    }

    // Cenário de teste 15: Divisão sendo que ambos os valores são zero
    @Test
    public void testDivisaoAmbosZero() {
        double resultado = Divisao.dividir(0, 0);
        Assertions.assertEquals(Double.NaN, resultado);
    }

    // Cenário de teste 16: Divisão por um valor negativo
    @Test
    public void testDivisaoNegativo() {
        double resultado = Divisao.dividir(10, -2);
        Assertions.assertEquals(-5, resultado);
    }
}
