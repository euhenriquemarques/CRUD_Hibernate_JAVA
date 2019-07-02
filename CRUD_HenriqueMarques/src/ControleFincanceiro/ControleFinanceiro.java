package ControleFincanceiro;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import ControleFincanceiro.enumPagamento.ConfirmaPagamento;
import ControleFincanceiro.enumQuinzena.Quinzena;
import agenda.modelo.Contato;

@Entity
public class ControleFinanceiro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String descricao;

	private BigDecimal valor;

	private String mes;
	
	@Enumerated(EnumType.STRING)
	private Quinzena quinzena;

	//anotação para o enum, onde eu defino apenas receba os dois tipo de valores definidos
	@Enumerated(EnumType.STRING)
	private ConfirmaPagamento pagamaneto;
	
	//faço o relacionamento entre as duas tabelas muitos para um
	@ManyToOne
	private Contato contato;


	public Quinzena getQuinzena() {
		return quinzena;
	}

	public void setQuinzena(Quinzena quinzena) {
		this.quinzena = quinzena;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public ConfirmaPagamento getPagamaneto() {
		return pagamaneto;
	}

	public void setPagamaneto(ConfirmaPagamento pagamaneto) {
		this.pagamaneto = pagamaneto;
	}


}
