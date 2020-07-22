package com.domain.pattern.strategy;

import java.io.IOException;

public class TestaImposto {
	public static void main(String[] args) {

		try {

			System.out.println("Informe o valor do salário:");
			double read = System.in.read();

			Orcamento orcamento = new Orcamento(read);

			ImpostoHendler impostoHendler = new ImpostoHendler();

			impostoHendler.realizaCalculo(orcamento, new ICMS());
			impostoHendler.realizaCalculo(orcamento, new ISS());
			impostoHendler.realizaCalculo(orcamento, new ICCC());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
