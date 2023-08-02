package main.java.br.com.alura.tdd.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.br.com.alura.tdd.modelo.Funcionario;
import main.java.br.com.alura.tdd.service.BonusService;

class TesteBonificacao {

	@Test
	public void DeveriaDar0ComUmSalarioMuitoAlto() {
		BonusService bonus = new BonusService();
		Assert.assertThrows(IllegalArgumentException.class, () -> bonus.calcularBonus(new Funcionario("jqbhsbdjhbd", LocalDate.now(), new BigDecimal("25000"))));
	}
	@Test
	public void OValorDoSalarioDeveriaSer10PorCento() {
		BonusService bonus = new BonusService();
		BigDecimal bonusReal = bonus.calcularBonus(new Funcionario("jqbhsbdjhbd", LocalDate.now(), new BigDecimal("2500")));
		Assert.assertEquals(new BigDecimal("250.00"), bonusReal);
	}
	@Test
	public void bonusDesconhecidoPara10000() {
		BonusService bonus = new BonusService();
		BigDecimal bonusReal = bonus.calcularBonus(new Funcionario("jqbhsbdjhbd", LocalDate.now(), new BigDecimal("10000")));
		Assert.assertEquals(new BigDecimal("1000.00"), bonusReal);
	}

}
