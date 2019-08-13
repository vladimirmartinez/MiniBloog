package com.vladimir.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vladimir.dao.IPersonaDAO;
import com.vladimir.model.Persona;

@Named
public class PersonaDAOImpl implements IPersonaDAO, Serializable {
	
	@PersistenceContext(unitName="blogPU")
	private EntityManager em;
	

	@Override
	public Integer registrar(Persona per) throws Exception {
		try {
			//em.getTransaction().begin();
			em.persist(per);
			//em.getTransaction().commit();
		} catch (Exception e) {
			//em.getTransaction().rollback();
		}
		
		return per.getIdPersona();
	}

	@Override
	public Integer modificar(Persona per) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer eliminar(Persona per) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona listarPorId(Persona per) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
