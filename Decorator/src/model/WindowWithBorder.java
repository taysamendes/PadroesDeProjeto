package model;

public class WindowWithBorder extends WindowDecorator {
	
	public WindowWithBorder(Window user_window) {
		super(user_window);
		super.setName("Window with border");
	}
}
