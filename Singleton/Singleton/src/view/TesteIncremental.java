package view;

import model.Incremental;

public class TesteIncremental {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Incremental inc = Incremental.getInstance();
			inc.setCount(i + 1);
			System.out.println(inc);
		}

	}
}