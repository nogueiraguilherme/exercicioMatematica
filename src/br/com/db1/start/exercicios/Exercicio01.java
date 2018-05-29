package br.com.db1.start.exercicios;

public class Exercicio01 {

	private Double v1 = 2d;
	private Double v2 = 5d;

	public Double menorValor() {
		if (v1 < v2) {
			return v1;
		}
		return v2;
	}

	public Double getV1() {
		return v1;
	}

	public void setV1(Double v1) {
		this.v1 = v1;
	}

	public Double getV2() {
		return v2;
	}

	public void setV2(Double v2) {
		this.v2 = v2;
	}

}
