package view;

import model.AbstractGame;
import model.Cricket;
import model.Football;

public class TemplatePatternDemo {
	public static void main(String[] args) {

		AbstractGame game = new Football();

		System.out.println("-------------------------");

		AbstractGame game2 = new Cricket();

	}
}
