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
		draw2D();
	}
	
	private void draw2D() {
		
	}
}
