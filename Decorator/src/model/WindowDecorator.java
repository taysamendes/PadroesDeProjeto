package model;

public class WindowDecorator extends Window {
	Window window;

	public WindowDecorator(Window user_window) {
		window = user_window;
	}

	public void draw() {
        System.out.println(window.getName()  + " + " + super.getName());
    }

}
