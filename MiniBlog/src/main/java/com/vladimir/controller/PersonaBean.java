package com.vladimir.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.vladimir.model.Persona;
import com.vladimir.service.IPersonaService;
import com.vladimir.service.impl.PersonaServiceImpl;

@Named
@RequestScoped
public class PersonaBean implements Serializable {
	
	@Inject
	private IPersonaService service;
	private Persona persona;
	
	/*
	public PersonaBean() {
		//this.persona = new Persona();
		this.service = new PersonaServiceImpl();
	}*/
	
	@PostConstruct
	public void init() {
		this.persona = new Persona();
	}
	
	public void registrar() {
		
		try {
			this.service.registrar(this.persona);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Getter & setters

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	

}
