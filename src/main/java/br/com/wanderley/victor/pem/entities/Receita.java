package br.com.wanderley.victor.pem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.wanderley.victor.pem.entities.enums.TipoReceita;
import lombok.Data;

@Data
@Entity
public class Receita extends RegistroFinanceiro {
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoReceita tpReceita;
}
