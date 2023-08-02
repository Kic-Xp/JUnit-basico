package main.java.br.com.alura.tdd.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.java.br.com.alura.tdd.modelo.Funcionario;
import main.java.br.com.alura.tdd.service.ReajusteAnual;

class TesteBonusAnual {

	@Test
	void DeveriaSer3PorCentoSeForADesejar() {
		ReajusteAnual reajuste = new ReajusteAnual();
		Funcionario funcionario = new Funcionario("Valir", LocalDate.now(), new BigDecimal("2000"));
		reajuste.bonusAnual(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("2060.00"), funcionario.getSalario());

	}

	@Test
	void DeveriaSer15PorCentoSeForBom() {
		ReajusteAnual reajuste = new ReajusteAnual();
		Funcionario funcionario = new Funcionario("Valir", LocalDate.now(), new BigDecimal("2000"));
		reajuste.bonusAnual(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("2300.00"), funcionario.getSalario());

	}

	@Test
	void DeveriaSer20PorCentoSeForOtimo() {
		ReajusteAnual reajuste = new ReajusteAnual();
		Funcionario funcionario = new Funcionario("Valir", LocalDate.now(), new BigDecimal("2000"));
		reajuste.bonusAnual(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("2400.00"), funcionario.getSalario());
	}
}
