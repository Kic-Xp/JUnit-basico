package main.java.br.com.alura.tdd.test;

import java.math.BigDecimal;

public enum Desempenho {
	A_DESEJAR {
		@Override
		public BigDecimal getBonificacao() {
			return new BigDecimal("0.03");
		}
	}, BOM {
		@Override
		public BigDecimal getBonificacao() {
			return new BigDecimal("0.15");
		}
	}, OTIMO {
		@Override
		public BigDecimal getBonificacao() {
			return new BigDecimal("0.20");
		}
	};
	
	public abstract BigDecimal getBonificacao();
	
	
}
