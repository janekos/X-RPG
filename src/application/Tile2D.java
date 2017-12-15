package application;

import javafx.scene.image.Image;

public class Tile2D {
	
	private String name;
	private Image img;
	private boolean walkable, interactable, teleport;
	
	public Tile2D(String _name, String source, boolean _walkable, boolean _interactable, boolean _teleport) {
		name = _name;
		img = new Image(source);
		walkable = _walkable;
		interactable = _interactable;
		teleport = _teleport;
	}	
	public String getName() { return name;}
	public Image getImg() {return img;}
	public boolean getWalkable() {return walkable;}
	public boolean getInteractable() {return interactable;}
	public boolean getTeleport() {return teleport;}
	
}
