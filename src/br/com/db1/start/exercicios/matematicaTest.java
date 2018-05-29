package br.com.db1.start.exercicios;

import org.junit.Assert;
import org.junit.Test;

public class matematicaTest {

	@Test
	public void menorValorTest() {
		Exercicio01 ex1 = new Exercicio01();
		Assert.assertTrue(v1 == ex1.menorValor());
	}

	@Test
	public void menorValor2Test() {
		Exercicio02 ex2 = new Exercicio02();
		Assert.assertTrue(ex2.menorValor2());
	}

	@Test
	public void exibeMediaTest() {
		Exercicio03 ex3 = new Exercicio03();
		Assert.assertTrue(5 == ex3.exibeMedia());
	}

	@Test
	public void calcAreaTrianguloTest() {
		Exercicio04 ex4 = new Exercicio04();
		Assert.assertTrue(5 == ex4.calcAreaTriangulo());
	}

}
