package components;

import javax.ejb.EJB;
import javax.enterprise.inject.*;
import br.ufes.inf.nemo.jbutler.ejb.controller.JSFController;

/** TODO: generated by FrameWeb. Should be documented. */
@Model
public class LvListaNotas extends JSFController {
	/** Serialization id (using default value, change if necessary). */
	private static final long serialVersionUID = 1L;

	

	
	/** TODO: generated by FrameWeb. Should be documented. */
	private List notas;
	

	
		
	
	
	
		
			/** TODO: generated by FrameWeb. Should be documented. */
			public void atualizar() {
				// FIXME: auto-generated method stub
				return;
			}
		
	
	
	
	/** Getter for notas. */
	public List getNotas() {
		return notas;
	}

	/** Setter for notas. */
	public void setNotas(List notas) {
		this.notas = notas;
	}
	

}