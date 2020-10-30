package model;

public class WindowWithHorizontalScrollbar extends WindowDecorator {
	
	public WindowWithHorizontalScrollbar(Window user_window) {
		super(user_window);
		super.setName("Window With Horizontal Scrollbar");
	}
	
	public void draw() {};
}
