package br.com.wanderley.victor.pem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.wanderley.victor.pem.entities.enums.TipoDespesa;
import lombok.Data;

@Data
@Entity
public class Despesa extends RegistroFinanceiro {
	@Column(nullable = false)
	private Boolean parecelado;
	@Column(nullable = true)
	private Integer qtdParcelas;
	@Column(nullable = true)
	private Integer parcelaAtual;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoDespesa tpDespesa;
}
