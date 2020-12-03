package view;

import java.util.Iterator;

import model.EsporteRepository;
import model.FilmeRepository;

public class App {
	public static void main(String[] args) {
		FilmeRepository fRep = new FilmeRepository();
		EsporteRepository eRep = new EsporteRepository();

		for (Iterator<String> iterator = fRep.getIterator(); iterator.hasNext();) {
			String filme = iterator.next();
			System.out.println("Filme: " + filme);
		}
		
		System.out.println("-------------------------");
		
		for (Iterator<String> iterator = eRep.getIterator(); iterator.hasNext();) {
			String esporte = iterator.next();
			System.out.println("Esporte: " + esporte);
		}

	}
}
