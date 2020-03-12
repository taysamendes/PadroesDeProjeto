package model;

public class SaudacaoFabrica {
	private String genero;

	public SaudacaoFabrica(String genero) {
		super();
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Pessoa getSaudar(String nome) {
		if (this.genero.equals("m"))
			return new Homem(nome);
		else if (this.genero.equals("f"))
			return new Mulher(nome);
		else
			return new Pessoa(nome);
	}
}
