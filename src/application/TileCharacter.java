package application;

import javafx.scene.image.Image;

public class TileCharacter {
	private String name;
	private Image img;
	private boolean interactable, fightable;
	private int locX, locY, level;
	
	public TileCharacter(String _name, String source, boolean _interactable, boolean _fightable, int _locX, int _locY) {
		name = _name;
		img = new Image(source);
		interactable = _interactable;
		fightable = _fightable;
		locX = _locX;
		locY = _locY;
	}	
	public String getName() { return name;}
	public Image getImg() {return img;}
	public boolean getInteractable() {return interactable;}
	public boolean getFightable() {return fightable;}
	public int getLocX() {return locX;}
	public int getLocY() {return locY;}
	public void setLocX(int _locX) {locX = _locX;}
	public void setLocY(int _locY) {locY = _locY;}
	
	public static TileCharacter PLAYER = new TileCharacter("PLAYER_TILE", "file:src\\tiles\\characters\\HUMAN1_CREATURE_TILE.png", false, false, 9, 4);
	public static TileCharacter FRIEND1 = new TileCharacter("FRIEND1_TILE", "file:src\\tiles\\characters\\HUMAN2_CREATURE_TILE.png", true, false, 6, 6);
	public static TileCharacter FRIEND2 = new TileCharacter("FRIEND2_TILE", "file:src\\tiles\\characters\\HUMAN3_CREATURE_TILE.png", true, false, 9,9);
	public static TileCharacter FRIEND3 = new TileCharacter("FRIEND3_TILE", "file:src\\tiles\\characters\\HUMAN4_CREATURE_TILE.png", true, false, 7,7);
	public static TileCharacter DOG = new TileCharacter("DOG_TILE", "file:src\\tiles\\characters\\DOG_CREATURE_TILE.png", true, true, 2, 7);
}
