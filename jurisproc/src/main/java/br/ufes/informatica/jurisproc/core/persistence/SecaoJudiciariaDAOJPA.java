package br.ufes.informatica.jurisproc.core.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.informatica.jurisproc.core.domain.SecaoJudiciaria;

/** TODO: generated by FrameWeb. Should be documented. */
@Stateless
public class SecaoJudiciariaDAOJPA extends BaseJPADAO<SecaoJudiciaria> implements SecaoJudiciariaDAO{
	/** Serialization id (using default value, change if necessary). */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. */
    @PersistenceContext
    private EntityManager entityManager;

	/** TODO: generated by FrameWeb. Should be documented. */
	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
    
    

}