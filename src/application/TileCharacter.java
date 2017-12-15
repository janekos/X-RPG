package application;

import javafx.scene.image.Image;

public class TileCharacter {
	
	private String name;
	private Image img;
	private boolean interactable, fightable;
	private int locX, locY, level;
	
	public TileCharacter(String name, String source, boolean interactable, boolean fightable, int locX, int locY) {
		this.name = name;
		this.img = new Image(source);
		this.interactable = interactable;
		this.fightable = fightable;
		this.locX = locX;
		this.locY = locY;
	}

	public String getName() { return name;}
	public Image getImg() {return img;}
	public boolean getInteractable() {return interactable;}
	public boolean getFightable() {return fightable;}
	public int getLocX() {return locX;}
	public int getLocY() {return locY;}
	public void setLocX(int _locX) {locX = _locX;}
	public void setLocY(int _locY) {locY = _locY;}
	

}
