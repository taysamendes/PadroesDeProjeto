package model;

public class Mulher extends Pessoa {
	
	public Mulher(String nome) {
		super(nome);
	}
	
	public String saudar() {
		return "Bem vinda, Sra. "+getNome();
	}
}
