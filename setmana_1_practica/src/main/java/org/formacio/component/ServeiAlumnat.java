package org.formacio.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServeiAlumnat {

	
	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb 
	 * el corresponent codi.
	 * Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */
	
	@Autowired
	private RepositoriAlumnesMemoria repositori;
	
	public ServeiAlumnat(RepositoriAlumnes repositori) {
		this.repositori = (RepositoriAlumnesMemoria) repositori;
		repositori.altaAlumne(1, "Antonia");
		repositori.altaAlumne(2,"Joan");
	}

	public boolean matricula (int id, String alumne) {
		
		if (alumne==null) {		
			return false;		
		}
		
		repositori.altaAlumne(id, alumne);
		return true;		
	}
	/*
	public int midaRepositori() {
		int numero = this.repositori.llistaAlumnes().size();
		return numero;
	}
	*/
	
}
