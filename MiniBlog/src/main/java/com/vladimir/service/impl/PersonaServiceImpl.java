package com.vladimir.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Named;

import com.vladimir.dao.IPersonaDAO;
import com.vladimir.model.Persona;
import com.vladimir.service.IPersonaService;


@Named
public class PersonaServiceImpl implements IPersonaService, Serializable {
	
	@EJB //@Inject
	private IPersonaDAO dao;
	
	/*public PersonaServiceImpl() {
		dao = new PersonaDAOImpl();
	}*/

	@Override
	public Integer registrar(Persona per) throws Exception {
		// TODO Auto-generated method stub
		return dao.registrar(per);
	}

	@Override
	public Integer modificar(Persona per) throws Exception {
		// TODO Auto-generated method stub
		return dao.modificar(per);
	}

	@Override
	public Integer eliminar(Persona per) throws Exception {
		// TODO Auto-generated method stub
		return dao.eliminar(per);
	}

	@Override
	public List<Persona> listar() throws Exception {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public Persona listarPorId(Persona per) throws Exception {
		// TODO Auto-generated method stub
		return dao.listarPorId(per);
	}

}
