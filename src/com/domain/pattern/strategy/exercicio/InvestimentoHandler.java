package com.domain.pattern.strategy.exercicio;

public class InvestimentoHandler {

	public void realiza(Conta conta, Investimento investimento) {
		double resultado = investimento.calcula(conta);

		conta.deposita(resultado * 0.75);
		System.out.println("Saldo: " + conta.getSaldo());
	}
}
