package model;

public class WindowWithVerticalScrollbar extends WindowDecorator {
	public WindowWithVerticalScrollbar(Window user_window) {
		super(user_window);
		super.setName("Window With Vertical Scrollbar");
	}
	
	public void draw() {}
}
