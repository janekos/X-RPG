package application;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import static application.TileCharacter.*;

import java.util.Arrays;

public class PlayGame {
	
	private Pane p;
	private GraphicsContext world;
	private GraphicsContext character;
	private GraphicsContext blackSpace;
	private int currLevel = 0;
	private Tile2D[][] currMap = Config.maps[currLevel];
	
	public PlayGame(Pane view) {
		p = view;
		world = ((Canvas) view.lookup("#world")).getGraphicsContext2D();
		character = ((Canvas) view.lookup("#character")).getGraphicsContext2D();
		blackSpace = ((Canvas) view.lookup("#blackSpace")).getGraphicsContext2D();
	}
	
	public void start() {
		drawOpenTwoD();
		drawCharacterLocations();
		drawCharactersTwoD();
		
		p.addEventFilter(KeyEvent.KEY_PRESSED,e -> {
			KeyCode key = ((KeyEvent) e).getCode();
			if(key == KeyCode.W || key == KeyCode.D || key == KeyCode.S || key == KeyCode.A) {
				int pX = PLAYER.getLocX();
				int pY = PLAYER.getLocY();
				
				Config.characters[pX][pY] = null;
				
				if(key == KeyCode.W) {
					if(pX - 1 != -1 && currMap[pX-1][pY].getWalkable() && Config.characters[pX-1][pY] == null) {
						PLAYER.setLocX(pX - 1);
						pX -= 1;
					}else if(Config.characters[pX-1][pY] != null) {System.out.println("TODO");}
				}else if(key.equals(KeyCode.D)) {
					if(pY + 1 != 10 && currMap[pX][pY+1].getWalkable() && Config.characters[pX][pY+1] == null) {
						PLAYER.setLocY(pY + 1);
						pY += 1;
					}else if(Config.characters[pX][pY+1] != null) {System.out.println("TODO");}
				}else if(key.equals(KeyCode.S)) {if(pX+1 != 10 && currMap[pX+1][pY].getWalkable() && Config.characters[pX+1][pY] == null) {
					PLAYER.setLocX(pX + 1);
					pX += 1;}else if(Config.characters[pX+1][pY] != null) {System.out.println("TODO");}
				}else if(key.equals(KeyCode.A)) {if(pY-1 != -1 && currMap[pX][pY-1].getWalkable() && Config.characters[pX][pY-1] == null) {
					PLAYER.setLocY(pY - 1);
					pY -= 1;}else if(Config.characters[pX][pY-1] != null) {System.out.println("TODO");}
				}
				
				/*level change*/
				if(pX == Config.mapStartEnd[currLevel][2] && pY == Config.mapStartEnd[currLevel][3]) {
					currLevel +=1;
					currMap = Config.maps[currLevel];
					drawCharacterLocations();
					pX = Config.mapStartEnd[currLevel][0];
					pY = Config.mapStartEnd[currLevel][1];
					PLAYER.setLocX(pX);
					PLAYER.setLocY(pY);
					drawOpenTwoD();
				}
				
				if(currMap[pX][pY].getTeleport()) {
					for(int i = 0; i<10; i++) {
						for(int j = 0; j<10; j++) {
							if(currMap[j][i].getTeleport() && (pX != j && pY != i)) {
								PLAYER.setLocX(j);
								PLAYER.setLocY(i+1);
								pX = j;
								pY = i+1;
								break;
							}
						}
					}
				}
				
				Config.characters[pX][pY] = PLAYER;
				drawCharactersTwoD();
						
			}
		});
	}
	
	private void drawOpenTwoD() {
		clearCanvas(world);
		blackSpace.fillRect(0, 0, 640, 640);
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				world.drawImage(currMap[j][i].getImg(), i*64, j*64, 64, 64);
			}
		}
	}
	
	private void drawCharacterLocations() {
		for(int i = 0; i < Config.charPerLevel[currLevel].length; i++) {
			if(Config.charPerLevel[currLevel][i].getName().equals("PLAYER_TILE")) {
				Config.characters[Config.mapStartEnd[currLevel][0]][Config.mapStartEnd[currLevel][1]] = Config.charPerLevel[currLevel][i];				
			}else {
				Config.characters[Config.charPerLevel[currLevel][i].getLocX()][Config.charPerLevel[currLevel][i].getLocY()] = Config.charPerLevel[currLevel][i];	
			}
		}
	}
	
	private void drawCharactersTwoD() {
		clearCanvas(character);
		/*for(int i = 0; i<Config.characters.length; i++) {
			System.out.println(Arrays.toString(Config.characters[i]));
		}*/
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				try {
					character.drawImage(Config.characters[j][i].getImg(), i*64, j*64, 64, 64);
				} catch (Exception e) {}
			}
		}		
	}
	
	private void clearCanvas(GraphicsContext c) {
		c.clearRect(0, 0, 640, 640);
	}
	
}
