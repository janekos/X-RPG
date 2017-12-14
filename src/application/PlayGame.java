package application;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class PlayGame {
	
	private Pane p;
	private GraphicsContext world;
	private GraphicsContext character;
	private GraphicsContext blackSpace;
	
	public PlayGame(Pane view) {
		p = view;
		world = ((Canvas) view.lookup("#world")).getGraphicsContext2D();
		character = ((Canvas) view.lookup("#character")).getGraphicsContext2D();
		blackSpace = ((Canvas) view.lookup("#blackSpace")).getGraphicsContext2D();
	}
	
	public void start() {
		drawOpenTwoD(Config.map1);
		Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = TileCharacter.PLAYER;
		drawCharactersTwoD();
		
		p.addEventFilter(KeyEvent.KEY_PRESSED,e -> {
			KeyCode key = ((KeyEvent) e).getCode();
			if(key == KeyCode.W || key == KeyCode.D || key == KeyCode.S || key == KeyCode.A) {
				int pX = TileCharacter.PLAYER.getLocX();
				int pY = TileCharacter.PLAYER.getLocY();
				
				Config.characters1[pX][pY] = null;
				
				if(key == KeyCode.W) {if(pX - 1 != -1 && Config.map1[pX-1][pY].getWalkable()) {TileCharacter.PLAYER.setLocX(pX - 1);}}
				else if(key.equals(KeyCode.D)) {if(pY + 1 != 10 && Config.map1[pX][pY+1].getWalkable()) {TileCharacter.PLAYER.setLocY(pY + 1);}}
				else if(key.equals(KeyCode.S)) {if(pX+1 != 10 && Config.map1[pX+1][pY].getWalkable()) {TileCharacter.PLAYER.setLocX(pX + 1);}}
				else if(key.equals(KeyCode.A)) {if(pY-1 != -1 && Config.map1[pX][pY-1].getWalkable()) {TileCharacter.PLAYER.setLocY(pY - 1);}}
				
				Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = TileCharacter.PLAYER;
				drawCharactersTwoD();
						
			}
		});
	}
	
	private void drawOpenTwoD(Tile2D[][] map) {
		clearCanvas(world);
		blackSpace.fillRect(0, 0, 640, 640);
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				world.drawImage(map[j][i].getImg(), i*64, j*64, 64, 64);
			}
		}
	}
	
	private void drawCharactersTwoD() {
		clearCanvas(character);
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				try {
					character.drawImage(Config.characters1[j][i].getImg(), i*64, j*64, 64, 64);
				} catch (Exception e) {}
			}
		}		
	}
	
	private void clearCanvas(GraphicsContext c) {
		c.clearRect(0, 0, 640, 640);
	}
	
}
