package br.ufes.informatica.jurisproc.core.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

/** TODO: generated by FrameWeb. Should be documented. */
@Entity
public class Assunto extends PersistentObjectSupport implements Comparable<Assunto>
{
	/** Serialization id. */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private String nome;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private String competencia;

	/** TODO: generated by FrameWeb. Should be documented. */
	@ManyToMany
	private Set<PedidoUniformizacao> pedidosUniformizacoes;

	/** Getter for nome. */
	public String getNome()
	{
		return nome;
	}

	/** Setter for nome. */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/** Getter for competencia. */
	public String getCompetencia()
	{
		return competencia;
	}

	/** Setter for competencia. */
	public void setCompetencia(String competencia)
	{
		this.competencia = competencia;
	}
	
	public Set<PedidoUniformizacao> getPedidosUniformizacoes()
	{
		return pedidosUniformizacoes;
	}

	public void setPedidosUniformizacoes(Set<PedidoUniformizacao> pedidosUniformizacoes)
	{
		this.pedidosUniformizacoes = pedidosUniformizacoes;
	}

	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(Assunto o)
	{
		// FIXME: auto-generated method stub
		return super.compareTo(o);
	}
}