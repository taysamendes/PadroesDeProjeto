package view;

import model.Window;
import model.WindowWithHorizontalScrollbar;
import model.WindowWithScroll;
import model.WindowWithVerticalScrollbar;

public class App {

	public static void main(String[] args) {
		Window my_window = new WindowWithScroll();
		System.out.println(my_window.getName());
		
		my_window = new WindowWithHorizontalScrollbar(my_window);
		System.out.println(my_window.getName());

		my_window = new WindowWithVerticalScrollbar(my_window);
		System.out.println(my_window.getName());

	}

}
