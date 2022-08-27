package br.com.wanderley.victor.pem.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoReceita {
	POUPANCA("Poupança"),	
	PAGAMENTO("Pagamento"),	
	BONUS("Bônus"),
	JUROS("Juros"),
	OUTROS("Outros"),	
	CREDITO("Crédito"),
	SALARIO("Salário");
	
	private final String tpReceita;
}
