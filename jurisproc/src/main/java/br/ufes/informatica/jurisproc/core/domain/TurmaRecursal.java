package br.ufes.informatica.jurisproc.core.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

/** TODO: generated by FrameWeb. Should be documented. */
@Entity
public class TurmaRecursal extends PersistentObjectSupport implements Comparable<TurmaRecursal>
{
	/** Serialization id. */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private String competencia;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private String acordao;
	
	@OneToMany(mappedBy = "turmaRecursal")
	private Set<Relatoria> relatorias;

	/** TODO: generated by FrameWeb. Should be documented. */
	@ManyToOne
	private SecaoJudiciaria secaoJudiciaria;

	/** TODO: generated by FrameWeb. Should be documented. */
	@OneToMany(mappedBy = "turmaRecursal")
	private Set<Acordao> acordaos;

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

	/** Getter for acordao. */
	public String getAcordao()
	{
		return acordao;
	}

	/** Setter for acordao. */
	public void setAcordao(String acordao)
	{
		this.acordao = acordao;
	}

	public Set<Relatoria> getRelatorias()
	{
		return relatorias;
	}

	public void setRelatorias(Set<Relatoria> relatorias)
	{
		this.relatorias = relatorias;
	}

	public SecaoJudiciaria getSecaoJudiciaria()
	{
		return secaoJudiciaria;
	}

	public void setSecaoJudiciaria(SecaoJudiciaria secaoJudiciaria)
	{
		this.secaoJudiciaria = secaoJudiciaria;
	}

	public Set<Acordao> getAcordaos()
	{
		return acordaos;
	}

	public void setAcordaos(Set<Acordao> acordaos)
	{
		this.acordaos = acordaos;
	}
	
	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(TurmaRecursal o)
	{
		// FIXME: auto-generated method stub
		return super.compareTo(o);
	}
}