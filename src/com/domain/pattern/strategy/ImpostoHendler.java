package com.domain.pattern.strategy;

public class ImpostoHendler {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {

		double valor = impostoQualquer.calcula(orcamento);
		System.out.println(valor);
	}
}
