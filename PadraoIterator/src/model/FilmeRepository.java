package model;

import java.util.Iterator;

public class FilmeRepository implements Container {

	private String filmes[] = {"Perdido em Marte","Interestelar","Gravidade", "O Primeiro Homem"};
	
	public Iterator<String> getIterator(){
		return new FilmeIterator();
	}
	
	public String[] getFilmes() {
		return filmes;
	}
	
	public void setFilmes(String filmes[]) {
		this.filmes =  filmes;
	}
	
	
}
