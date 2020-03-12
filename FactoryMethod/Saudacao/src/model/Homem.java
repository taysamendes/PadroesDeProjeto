package model;

public class Homem extends Pessoa{

	public Homem(String nome) {
		super(nome);
	}
	
	public String saudar() {
		return "Bem vindo, Sr. "+getNome();
	}
}
