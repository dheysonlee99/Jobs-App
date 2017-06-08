package br.edu.ifpi.jobapp.app;

import br.edu.ifpi.jobsapp.model.Empresa;
import br.edu.ifpi.jobsapp.model.Local;

public class TesteEmpresa {

	public static void main(String[] args) {
		
		Local local = new Local("Teresina");
		
		Empresa empresa = new Empresa("ZeDaEsquina", local,
				"www.zedaesquina.com","Empresa de TI",
				"zedaesquina@gmail.com","logotipo");
		
		System.out.println(empresa);
	}

}
