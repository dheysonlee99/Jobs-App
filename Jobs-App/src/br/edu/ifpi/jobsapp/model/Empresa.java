package br.edu.ifpi.jobsapp.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nomeCompleto;
	private Local local;
	private String site;
	private String Descricao;
	private String email;
	private String logotipo;
	private List<Vaga> vagas = new ArrayList<Vaga>();
	
	public Empresa() {
		
	}
	public Empresa(String nomeCompleto, Local local, String site, String descricao, String email, String logotipo){
		this.nomeCompleto = nomeCompleto;
		this.local = local;
		this.site = site;
		this.Descricao = descricao;
		this.email = email;
		this.logotipo = logotipo;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogotipo() {
		return logotipo;
	}
	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}
	public List getVagas() {
		return vagas;
	}
	public void setVagas(List vagas) {
		this.vagas = vagas;
	}
	
	@Override
	public String toString() {
		
		return this.nomeCompleto +" "+ this.local + " "+ this.site + " "+ this.Descricao + " " + this.email + " "+ this.logotipo;
	}

}
