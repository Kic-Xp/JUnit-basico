package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import main.java.br.com.alura.tdd.modelo.Funcionario;
import main.java.br.com.alura.tdd.test.Desempenho;

public class ReajusteAnual {

	public void bonusAnual(Funcionario funcionario, Desempenho desempenho) {
		if(desempenho == Desempenho.A_DESEJAR) {
			
			BigDecimal aumento = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			aumento.setScale(2, RoundingMode.HALF_UP);
			funcionario.ajusteSalario(aumento);
		}else if(desempenho == Desempenho.BOM) {
			BigDecimal aumento = funcionario.getSalario().multiply(new BigDecimal("0.15"));
			aumento.setScale(2, RoundingMode.HALF_UP);
			funcionario.ajusteSalario(aumento);
		}else if(desempenho == Desempenho.OTIMO) {
			BigDecimal aumento = funcionario.getSalario().multiply(new BigDecimal("0.20"));
			aumento.setScale(2, RoundingMode.HALF_UP);
			funcionario.ajusteSalario(aumento);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
