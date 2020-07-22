package com.domain.pattern.strategy.exercicio;

import java.util.Random;

public class Moderado implements Investimento {

	private Random randon;

	public Moderado() {
		this.randon = new Random();
	}

	@Override
	public double calcula(Conta conta) {
		if (randon.nextInt(2) == 0)
			return conta.getSaldo() * 0.025;
		return conta.getSaldo() * 0.007;
	}

}
