package br.edu.ifpi.jobsapp.model;

import java.util.ArrayList;

public class TipoDeContratacao {
	
	// class attributes
	
	private String nome;
	ArrayList<String> vagas;
	
	// getters and setters 
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setVagas(ArrayList<String> vagas){
		this.vagas = vagas;
	}
	
	public String getNome(){
		return this.nome;
	}
	public ArrayList<String> getVagas(){
		return this.vagas;
	}

}
