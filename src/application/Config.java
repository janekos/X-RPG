package application;

public class Config {
	
	// tile 2D
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
	
	//	tile characters
	public static TileCharacter PLAYER = new TileCharacter("PLAYER_TILE", "file:src\\tiles\\characters\\HUMAN1_CREATURE_TILE.png", false, false, 9, 4);
	public static TileCharacter FRIEND1 = new TileCharacter("FRIEND1_TILE", "file:src\\tiles\\characters\\HUMAN2_CREATURE_TILE.png", true, false, 6, 6);
	public static TileCharacter FRIEND2 = new TileCharacter("FRIEND2_TILE", "file:src\\tiles\\characters\\HUMAN3_CREATURE_TILE.png", true, false, 9,9);
	public static TileCharacter FRIEND3 = new TileCharacter("FRIEND3_TILE", "file:src\\tiles\\characters\\HUMAN4_CREATURE_TILE.png", true, false, 7,7);
	public static TileCharacter DOG = new TileCharacter("DOG_TILE", "file:src\\tiles\\characters\\DOG_CREATURE_TILE.png", true, true, 2, 7);
	
	/*2D maps*/
	public static Tile2D[][][] maps = {
			{
	            {TREE_GRASS_METAL_FENCE_LEFT_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_METAL_FENCE_RIGHT_DARKER},
	            {METAL_FENCE_LEFT_DIRT, GRASS, GRASS, GRASS, GRASS, GRASS, GRASS, GRASS, GRASS, METAL_FENCE_RIGHT_DIRT},
	            {METAL_FENCE_LEFT_DIRT, GRASS, GRASS, GRASS, GRASS, GRASS, GRASS, GRASS, GRASS, METAL_FENCE_RIGHT_DIRT},
	            {METAL_FENCE_LEFT_DIRT, GRASS, GRASS, GRASS, GRASS, GRASS, GRASS, GRASS, GRASS, METAL_FENCE_RIGHT_DIRT},
	            {METAL_FENCE_LEFT_DIRT, GRASS, GRASS, BUSH_GRASS_TILE, HOUSE_UPPER_LEFT_GRASS, HOUSE_UPPER_RIGHT_GRASS, BUSH_GRASS_TILE, GRASS, GRASS, METAL_FENCE_RIGHT_DIRT},
	            {METAL_FENCE_LEFT_DIRT, GRASS, GRASS, BUSH_GRASS_TILE, HOUSE_LOWER_LEFT_GRASS, HOUSE_LOWER_RIGHT_GRASS, BUSH_GRASS_TILE, GRASS, GRASS, METAL_FENCE_RIGHT_DIRT},
	            {METAL_FENCE_LEFT_DIRT, GRASS, GRASS, ROCK_GRASS, PAVEMENT, GRASS, GRASS, GRASS, GRASS, METAL_FENCE_RIGHT_DIRT},
	            {METAL_FENCE_LEFT_DIRT, GRASS, GRASS, GRASS, PAVEMENT, GRASS, GRASS, GRASS, GRASS, METAL_FENCE_RIGHT_DIRT},
	            {METAL_FENCE_LEFT_DIRT, GRASS, GRASS, GRASS, PAVEMENT, GRASS, GRASS, GRASS, GRASS, METAL_FENCE_RIGHT_DIRT},
	            {METAL_FENCE_GRASS, METAL_FENCE_GRASS, METAL_FENCE_GRASS, METAL_FENCE_GRASS, PAVEMENT, METAL_FENCE_GRASS, METAL_FENCE_GRASS, METAL_FENCE_GRASS, METAL_FENCE_GRASS, METAL_FENCE_GRASS}
			},{			
		        {TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER},
		        {TREE_GRASS_DARKER, GRASS_DARKER_HOLE, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER},
		        {TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, DIRT, TREE_GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER},
		        {TREE_GRASS_DARKER, GRASS_DARKER, DIRT, DIRT, DIRT, TREE_GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER},
		        {TREE_GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER, ROCK_DIRT, DIRT, TREE_GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER},
		        {TREE_GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER},
		        {TREE_GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER, DIRT, DIRT, DIRT, TREE_GRASS_DARKER},
		        {TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER, ROCK_DIRT, ROCK_DIRT, DIRT, TREE_GRASS_DARKER},
		        {TREE_GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER, ROCK_DIRT, GRASS_DARKER_HOLE, DIRT, TREE_GRASS_DARKER},
		        {TREE_GRASS_DARKER, GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER, TREE_GRASS_DARKER}
			}
		};
	/*map end locations*/
	public static int[][] mapStartEnd = {
			{PLAYER.getLocX(),PLAYER.getLocY(), 0, 7},
			{9,1,-1,-1}
	};
	/*characters*/
	public static TileCharacter[][] characters = new TileCharacter[10][10];
	
	/*characters per level*/
	public static TileCharacter[][] charPerLevel = {
			{PLAYER},
			{PLAYER, DOG}
	};
	

}
