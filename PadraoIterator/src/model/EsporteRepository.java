package model;

import java.util.Iterator;

public class EsporteRepository implements Container {

	private String esportes[] = { "ESPN Brasil", "Fox Esportes", "SPORTV" };

	public Iterator<String> getIterator() {
		return new EsporteIterator();
	}

	public String[] getEsportes() {
		return esportes;
	}

	public void setEsportes(String filmes[]) {
		this.esportes = esportes;
	}
}
