package application;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

public class PlayGame {
	
	private GraphicsContext world;
	private GraphicsContext character;
	
	public PlayGame(Pane view) {
		world = ((Canvas) view.lookup("#world")).getGraphicsContext2D();
		character = ((Canvas) view.lookup("#character")).getGraphicsContext2D();
	}
	
	public void start() {
		drawMap(Config.map1);
	}
	
	private void drawMap(Tile[][] map) {
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				world.fillRect(i*64, j*64, 64, 64);
			}
		}
	}
}
