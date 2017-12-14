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
	
	public Tile BUSH_GRASS_TILE = new Tile("BUSH_GRASS_TILE", "tiles/twoD/BUSH_GRASS_TILE.png", false, false);
	public Tile DIRT = new Tile("DIRT", "tiles/twoD/DIRT_TILE.png", true, false);
	public Tile GRASS_DARKER = new Tile("GRASS_DARKER", "tiles/twoD/GRASS_DARKER_TILE.png", true, false);
	public Tile GRASS = new Tile("GRASS", "tiles/twoD/GRASS_TILE.png", true, false);
	public Tile HOUSE_LOWER_LEFT = new Tile("HOUSE_LOWER_LEFT", "tiles/twoD/HOUSE_LOWER_LEFT_TILE.png", false, true);
	public Tile HOUSE_LOWER_RIGHT = new Tile("HOUSE_LOWER_RIGHT", "tiles/twoD/HOUSE_LOWER_RIGHT_TILE.png", false, true);
	public Tile HOUSE_UPPER_LEFT = new Tile("HOUSE_UPPER_LEFT", "tiles/twoD/HOUSE_UPPER_LEFT_TILE.png", false, true);
	public Tile HOUSE_UPPER_RIGHT = new Tile("HOUSE_UPPER_RIGHT", "tiles/twoD/HOUSE_UPPER_RIGHT_TILE.png", false, true);
	public Tile METAL_FENCE_DIRT = new Tile("METAL_FENCE_DIRT", "tiles/twoD/METAL_FENCE_DIRT_TILE.png", false, false);
	public Tile METAL_FENCE_GRASS = new Tile("METAL_FENCE_GRASS", "tiles/twoD/METAL_FENCE_GRASS_TILE.png", false, false);
	public Tile PAVEMENT = new Tile("PAVEMENT", "tiles/twoD/PAVEMENT_TILE.png", true, false);
	public Tile ROCK_DIRT = new Tile("ROCK_DIRT", "tiles/twoD/ROCK_DIRT_TILE.png", false, false);
	public Tile ROCK_GRASS = new Tile("ROCK_GRASS", "tiles/twoD/ROCK_GRASS_TILE.png", false, false);
	public Tile TREE_GRASS_DARKER = new Tile("TREE_GRASS_DARKER", "tiles/twoD/TREE_GRASS_DARKER_TILE.png", false, false);
	public Tile TREE_GRASS = new Tile("TREE_GRASS", "tiles/twoD/TREE_GRASS_TILE.png", false, false);
}
