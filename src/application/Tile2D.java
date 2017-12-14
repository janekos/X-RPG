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
	
	public static Tile2D BUSH_GRASS_TILE = new Tile2D("BUSH_GRASS_TILE", "file:src\\tiles\\twoD\\BUSH_GRASS_TILE.png", false, false, false);
	public static Tile2D DIRT = new Tile2D("DIRT", "file:src\\tiles\\twoD\\DIRT_TILE.png", true, false, false);
	public static Tile2D GRASS_DARKER = new Tile2D("GRASS_DARKER", "file:src\\tiles\\twoD\\GRASS_DARKER_TILE.png", true, false, false);
	public static Tile2D GRASS = new Tile2D("GRASS", "file:src\\tiles\\twoD\\GRASS_TILE.png", true, false, false);
	public static Tile2D HOUSE_LOWER_LEFT_GRASS = new Tile2D("HOUSE_LOWER_LEFT_GRASS", "file:src\\tiles\\twoD\\HOUSE_LOWER_LEFT_GRASS_TILE.png", false, true, false);
	public static Tile2D HOUSE_LOWER_RIGHT_GRASS = new Tile2D("HOUSE_LOWER_RIGHT_GRASS", "file:src\\tiles\\twoD\\HOUSE_LOWER_RIGHT_GRASS_TILE.png", false, true, false);
	public static Tile2D HOUSE_UPPER_LEFT_GRASS = new Tile2D("HOUSE_UPPER_LEFT_GRASS", "file:src\\tiles\\twoD\\HOUSE_UPPER_LEFT_GRASS_TILE.png", false, true, false);
	public static Tile2D HOUSE_UPPER_RIGHT_GRASS = new Tile2D("HOUSE_UPPER_RIGHT_GRASS", "file:src\\tiles\\twoD\\HOUSE_UPPER_RIGHT_GRASS_TILE.png", false, true, false);
	public static Tile2D METAL_FENCE_DIRT = new Tile2D("METAL_FENCE_DIRT", "file:src\\tiles\\twoD\\METAL_FENCE_DIRT_TILE.png", false, false, false);
	public static Tile2D METAL_FENCE_GRASS = new Tile2D("METAL_FENCE_GRASS", "file:src\\tiles\\twoD\\METAL_FENCE_GRASS_TILE.png", false, false, false);
	public static Tile2D PAVEMENT = new Tile2D("PAVEMENT", "file:src\\tiles\\twoD\\PAVEMENT_TILE.png", true, false, false);
	public static Tile2D ROCK_DIRT = new Tile2D("ROCK_DIRT", "file:src\\tiles\\twoD\\ROCK_DIRT_TILE.png", false, false, false);
	public static Tile2D ROCK_GRASS = new Tile2D("ROCK_GRASS", "file:src\\tiles\\twoD\\ROCK_GRASS_TILE.png", false, false, false);
	public static Tile2D TREE_GRASS_DARKER = new Tile2D("TREE_GRASS_DARKER", "file:src\\tiles\\twoD\\TREE_GRASS_DARKER_TILE.png", false, false, false);
	public static Tile2D TREE_GRASS = new Tile2D("TREE_GRASS", "file:src\\tiles\\twoD\\TREE_GRASS_TILE.png", false, false, false);
	public static Tile2D TREE_GRASS_METAL_FENCE_LEFT_DARKER = new Tile2D("TREE_GRASS_DARKER", "file:src\\tiles\\twoD\\TREE_GRASS_METAL_FENCE_LEFT_DARKER_TILE.png", false, false, false);
    public static Tile2D TREE_GRASS_METAL_FENCE_RIGHT_DARKER = new Tile2D("TREE_GRASS_DARKER", "file:src\\tiles\\twoD\\TREE_GRASS_METAL_FENCE_RIGHT_DARKER_TILE.png", false, false, false);
    public static Tile2D METAL_FENCE_LEFT_DIRT = new Tile2D("METAL_FENCE_DIRT", "file:src\\tiles\\twoD\\METAL_FENCE_LEFT_GRASS_TILE.png", true, false, false);
    public static Tile2D METAL_FENCE_RIGHT_DIRT = new Tile2D("METAL_FENCE_DIRT", "file:src\\tiles\\twoD\\METAL_FENCE_RIGHT_GRASS_TILE.png", true, false, false);
    public static Tile2D GRASS_DARKER_HOLE = new Tile2D("GRASS_DARKER_HOLE", "file:src\\tiles\\twoD\\GRASS_DARKER_HOLE_TILE.png", true, false, true);
}
