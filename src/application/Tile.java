package application;

import javafx.scene.image.Image;

public class Tile {
	
	private String name;
	private Image img;
	
	public Tile(String _name, String source, boolean walkable, boolean interactable) {
		name = _name;
		System.out.println(source);
		img = new Image(source);
	}	
	public String getName() { return name;}
	public Image getImg() {return img;}
}