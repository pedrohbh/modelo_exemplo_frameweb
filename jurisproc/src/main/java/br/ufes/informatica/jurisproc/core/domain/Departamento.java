package br.ufes.informatica.jurisproc.core.domain;

import java.util.*;
import java.math.*;
import javax.persistence.*;
import javax.validation.constraints.*;
import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

/** TODO: generated by FrameWeb. Should be documented. */
@Entity
public class Departamento extends PersistentObjectSupport implements Comparable<Departamento> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;



	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull  
	private String nome;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull  
	private String telefone;

	/** TODO: generated by FrameWeb. Should be documented. false */
	  
	private String descricao;







	/** Getter for nome. */
	public String getNome() {
		return nome;
	}
	
	/** Setter for nome. */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/** Getter for telefone. */
	public String getTelefone() {
		return telefone;
	}
	
	/** Setter for telefone. */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/** Getter for descricao. */
	public String getDescricao() {
		return descricao;
	}
	
	/** Setter for descricao. */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}








	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(Departamento o) {
		// FIXME: auto-generated method stub		
		return super.compareTo(o);
	}
}