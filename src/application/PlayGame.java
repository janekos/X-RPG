package application;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

public class PlayGame {
	
	private GraphicsContext world;
	private GraphicsContext character;
	private GraphicsContext blackSpace;
	
	public PlayGame(Pane view) {
		world = ((Canvas) view.lookup("#world")).getGraphicsContext2D();
		character = ((Canvas) view.lookup("#character")).getGraphicsContext2D();
		blackSpace = ((Canvas) view.lookup("#blackSpace")).getGraphicsContext2D();
	}
	
	public void start() {
		drawOpenTwoD(Config.map1);
		//character
	}
	
	private void drawOpenTwoD(Tile[][] map) {
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				world.drawImage(map[i][j].getImg(), i*64, j*64, 64, 64);
			}
		}
	}
	
	private void drawCloseTwoD(Tile[][] map) {
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				world.drawImage(map[i][j].getImg(), i*128, j*128, 128, 128);
			}
		}
	}
	
}
