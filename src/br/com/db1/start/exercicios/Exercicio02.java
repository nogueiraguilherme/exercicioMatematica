package br.com.db1.start.exercicios;

public class Exercicio02 {
	private Double v1 = 2d;
	private Double v2 = 5d;
	private Double v3 = 8d;

	public Double menorValor2() {
		if ((v1 < v2 & v1 < v3)) {
			return v1;
		} else if ((v2 < v1 & v2 < v3)) {
			return v2;
		}
		return v3;
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

	public Double getV3() {
		return v3;
	}

	public void setV3(Double v3) {
		this.v3 = v3;
	}

}
