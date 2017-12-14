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
			if(key == KeyCode.W) {
				Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = null;
				TileCharacter.PLAYER.setLocX(TileCharacter.PLAYER.getLocX() - 1);
				Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = TileCharacter.PLAYER;
				drawCharactersTwoD();
			}else if(key.equals(KeyCode.D)) {
				Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = null;
				TileCharacter.PLAYER.setLocY(TileCharacter.PLAYER.getLocY() + 1);
				Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = TileCharacter.PLAYER;
				drawCharactersTwoD();
			}else if(key.equals(KeyCode.S)) {
				Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = null;
				TileCharacter.PLAYER.setLocX(TileCharacter.PLAYER.getLocX() + 1);
				Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = TileCharacter.PLAYER;
				drawCharactersTwoD();
			}else if(key.equals(KeyCode.A)) {
				Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = null;
				TileCharacter.PLAYER.setLocY(TileCharacter.PLAYER.getLocY() - 1);
				Config.characters1[TileCharacter.PLAYER.getLocX()][TileCharacter.PLAYER.getLocY()] = TileCharacter.PLAYER;
				drawCharactersTwoD();
			}
		});
	}
	
	private void drawOpenTwoD(Tile2D[][] map) {
		blackSpace.fillRect(0, 0, 640, 640);
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				world.drawImage(map[j][i].getImg(), i*64, j*64, 64, 64);
			}
		}
	}
	
	private void drawCharactersTwoD() {
		character.clearRect(0, 0, 640, 640);
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				try {
					character.drawImage(Config.characters1[j][i].getImg(), i*64, j*64, 64, 64);
				} catch (Exception e) {}
			}
		}		
	}
	
	/*private void drawCloseTwoD(Tile[][] map) {
		blackSpace.fillRect(0, 0, 640, 640);
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				if() { }
				world.drawImage(map[i][j].getImg(), i*128, j*128, 128, 128);
			}
		}
	}*/
	
}
