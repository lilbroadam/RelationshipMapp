import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class GraphicsHandler {
	private static DrawingPanel dp;
	private static Graphics g;
	private static int width;
	private static int height;
	// need to figure out how to handle this better
	private static int personIconSize = 100;
	private static Color personIconBoundaryColor = new Color(191, 87, 0);
	
	public static void setUpWindow(int w, int h) {
		width = w;
		height = h;
		dp = new DrawingPanel(width, height);
	}
	
	public static void displayWindow() {
		g = dp.getGraphics();
		displayPeople();
	}
	
	private static void displayPeople() {
		for(Person person : Person.peopleList) {			
			if(person.isMainPerson() == false) {
				 
			}else {
				drawPerson(width, height, person.getName());
			}
		}
	}
	
	private static void drawPerson(int width, int height, String name) {
		drawPersonIcon(width/2, height/2);
		drawPersonName(name);
	}
	private static void drawPersonIcon(int x, int y) {
		int outterOffset = personIconSize/2;
		int innerIconSize = (int) Math.round(personIconSize*.9);
		int innerOffset = (innerIconSize/2);
		
		g.setColor(personIconBoundaryColor);
		g.fillOval(x - outterOffset, y - outterOffset, personIconSize, personIconSize);
		g.setColor(Color.WHITE);
		g.fillOval(x - innerOffset, y - innerOffset, innerIconSize, innerIconSize);
	}
	private static void drawPersonName(String name) {
		
	}
	
	
	//public static void setWidth(int width) { width = this.width;}	
	public static int getWidth() {return width;}
	//public static void setHeight(int height) { height = this.height;}
	public static int getHeight() {return height;}
}
