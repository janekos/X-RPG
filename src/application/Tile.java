package application;

import javafx.scene.image.Image;

public class Tile {
	
	private String name;
	private Image img;
	
	public Tile(String _name, String source, boolean walkable, boolean interactable) {
		name = _name;
		img = new Image(source);
	}	
	public String getName() { return name;}
	public Image getImg() {return img;}
	
	public static Tile BUSH_GRASS_TILE = new Tile("BUSH_GRASS_TILE", "file:src\\tiles\\twoD\\BUSH_GRASS_TILE.png", false, false);
	public static Tile DIRT = new Tile("DIRT", "file:src\\tiles\\twoD\\DIRT_TILE.png", true, false);
	public static Tile GRASS_DARKER = new Tile("GRASS_DARKER", "file:src\\tiles\\twoD\\GRASS_DARKER_TILE.png", true, false);
	public static Tile GRASS = new Tile("GRASS", "file:src\\tiles\\twoD\\GRASS_TILE.png", true, false);
	public static Tile HOUSE_LOWER_LEFT_GRASS = new Tile("HOUSE_LOWER_LEFT_GRASS", "file:src\\tiles\\twoD\\HOUSE_LOWER_LEFT_GRASS_TILE.png", false, true);
	public static Tile HOUSE_LOWER_RIGHT_GRASS = new Tile("HOUSE_LOWER_RIGHT_GRASS", "file:src\\tiles\\twoD\\HOUSE_LOWER_RIGHT_GRASS_TILE.png", false, true);
	public static Tile HOUSE_UPPER_LEFT_GRASS = new Tile("HOUSE_UPPER_LEFT_GRASS", "file:src\\tiles\\twoD\\HOUSE_UPPER_LEFT_GRASS_TILE.png", false, true);
	public static Tile HOUSE_UPPER_RIGHT_GRASS = new Tile("HOUSE_UPPER_RIGHT_GRASS", "file:src\\tiles\\twoD\\HOUSE_UPPER_RIGHT_GRASS_TILE.png", false, true);
	public static Tile METAL_FENCE_DIRT = new Tile("METAL_FENCE_DIRT", "file:src\\tiles\\twoD\\METAL_FENCE_DIRT_TILE.png", false, false);
	public static Tile METAL_FENCE_GRASS = new Tile("METAL_FENCE_GRASS", "file:src\\tiles\\twoD\\METAL_FENCE_GRASS_TILE.png", false, false);
	public static Tile PAVEMENT = new Tile("PAVEMENT", "file:src\\tiles\\twoD\\PAVEMENT_TILE.png", true, false);
	public static Tile ROCK_DIRT = new Tile("ROCK_DIRT", "file:src\\tiles\\twoD\\ROCK_DIRT_TILE.png", false, false);
	public static Tile ROCK_GRASS = new Tile("ROCK_GRASS", "file:src\\tiles\\twoD\\ROCK_GRASS_TILE.png", false, false);
	public static Tile TREE_GRASS_DARKER = new Tile("TREE_GRASS_DARKER", "file:src\\tiles\\twoD\\TREE_GRASS_DARKER_TILE.png", false, false);
	public static Tile TREE_GRASS = new Tile("TREE_GRASS", "file:src\\tiles\\twoD\\TREE_GRASS_TILE.png", false, false);
}
