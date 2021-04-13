package br.ufes.informatica.jurisproc.core.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

/** TODO: generated by FrameWeb. Should be documented. */
@Entity
public class Acordao extends PersistentObjectSupport implements Comparable<Acordao> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;



	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull  
	private Long numeroProcesso;




		
		/** TODO: generated by FrameWeb. Should be documented. */
		@OneToMany(mappedBy="Target")
		private Set<PedidoUniformizacao> Source;
		
	

		
		/** TODO: generated by FrameWeb. Should be documented. */
		@ManyToOne
		private TurmaRecursal Target;
		
	




	/** Getter for numeroProcesso. */
	public Long getNumeroProcesso() {
		return numeroProcesso;
	}
	
	/** Setter for numeroProcesso. */
	public void setNumeroProcesso(Long numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}




		
		/** Getter for Source. */
		public Set<PedidoUniformizacao> getSource() {
			return Source;
		}
		
		/** Setter for Source. */
		public void setSource(Set<PedidoUniformizacao> Source) {
			this.Source = Source;
		}
		
	

		
		/** Getter for Target. */
		public TurmaRecursal getTarget() {
			return Target;
		}
		
		/** Setter for Target. */
		public void setTarget(TurmaRecursal Target) {
			this.Target = Target;
		}
		
	





	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(Acordao o) {
		// FIXME: auto-generated method stub		
		return super.compareTo(o);
	}
}