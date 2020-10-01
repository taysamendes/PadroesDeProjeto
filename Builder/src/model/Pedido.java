package model;

public class Pedido {
	private String sanduiche;
	private String batata;
	private String brinquedo;
	private String refrigerante;

	public Pedido(String sanduiche, String batata, String brinquedo, String refrigerante) {
		super();
		this.sanduiche = sanduiche;
		this.batata = batata;
		this.brinquedo = brinquedo;
		this.refrigerante = refrigerante;
	}

	public Pedido() {}

	public String getSanduiche() {
		return sanduiche;
	}

	public void setSanduiche(String sanduiche) {
		this.sanduiche = sanduiche;
	}

	public String getBatata() {
		return batata;
	}

	public void setBatata(String batata) {
		this.batata = batata;
	}

	public String getBrinquedo() {
		return brinquedo;
	}

	public void setBrinquedo(String brinquedo) {
		this.brinquedo = brinquedo;
	}

	public String getRefrigerante() {
		return refrigerante;
	}

	public void setRefrigerante(String refrigerante) {
		this.refrigerante = refrigerante;
	}

}
