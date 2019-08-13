package com.vladimir.service;

import java.util.List;

import com.vladimir.model.Persona;

public interface IPersonaService {
	Integer registrar(Persona per) throws Exception;
	
	Integer modificar(Persona per) throws Exception;
	
	Integer eliminar(Persona per) throws Exception;
	
	List<Persona> listar() throws Exception;
	
	Persona listarPorId(Persona per) throws Exception;

}
