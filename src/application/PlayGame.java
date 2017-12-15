package application;

import static application.Config.*;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class PlayGame {

	private Pane p, fightPane;
	private GraphicsContext world, character, blackSpace, fightContext;
	private int currLevel = 0;
	private Tile2D[][] currMap = maps[currLevel];
	private Button att, def, heal, run;
	private Image fightImage;
	private static final String BOSS_NAME = "Dobermen";

	public PlayGame(Pane view) {
		p = view;
		fightPane = (Pane) view.lookup("#fightPane");
		att = (Button) fightPane.lookup("#btnAttack");
		def = (Button) fightPane.lookup("#btnDefend");
		heal = (Button) fightPane.lookup("#btnHeal");
		run = (Button) fightPane.lookup("#btnRun");
		fightContext= ((Canvas) fightPane.lookup("#fightCanvas")).getGraphicsContext2D();
		fightContext.setFont(new Font("Arial", 40));
		world = ((Canvas) view.lookup("#world")).getGraphicsContext2D();
		character = ((Canvas) view.lookup("#character")).getGraphicsContext2D();
		blackSpace = ((Canvas) view.lookup("#blackSpace")).getGraphicsContext2D();
	}

	public void start() {
		setListeners();
		drawOpenTwoD();
		drawCharacterLocations();
		drawCharactersTwoD();		
	}
	
	private void setListeners() {
		p.addEventFilter(KeyEvent.KEY_PRESSED, e -> {
			KeyCode key = ((KeyEvent) e).getCode();
			if (key == KeyCode.W || key == KeyCode.D || key == KeyCode.S || key == KeyCode.A) {
				int pX = PLAYER.getLocX();
				int pY = PLAYER.getLocY();

				characters[pX][pY] = null;

				if (key == KeyCode.W) {
					if (pX - 1 != -1 && currMap[pX - 1][pY].getWalkable() && characters[pX - 1][pY] == null) {
						PLAYER.setLocX(pX - 1);
						pX -= 1;
					} else if (characters[pX - 1][pY] != null) {
						fightPane.setOpacity(1);
						fightContext.drawImage(DOG.getImg(), 50, 50, 300, 300);
						fightContext.fillText(BOSS_NAME, 320, 100);
					}
				} else if (key.equals(KeyCode.D)) {
					if (pY + 1 != 10 && currMap[pX][pY + 1].getWalkable() && characters[pX][pY + 1] == null) {
						PLAYER.setLocY(pY + 1);
						pY += 1;
					} else if (characters[pX][pY + 1] != null) {
						fightPane.setOpacity(1);
						fightContext.drawImage(DOG.getImg(), 50, 50, 300, 300);
						fightContext.fillText(BOSS_NAME, 320, 100);
					}
				} else if (key.equals(KeyCode.S)) {
					if (pX + 1 != 10 && currMap[pX + 1][pY].getWalkable() && characters[pX + 1][pY] == null) {
						PLAYER.setLocX(pX + 1);
						pX += 1;
					} else if (characters[pX + 1][pY] != null) {
						fightPane.setOpacity(1);
						fightContext.drawImage(DOG.getImg(), 50, 50, 300, 300);
						fightContext.fillText(BOSS_NAME, 320, 100);
					}
				} else if (key.equals(KeyCode.A)) {
					if (pY - 1 != -1 && currMap[pX][pY - 1].getWalkable() && characters[pX][pY - 1] == null) {
						PLAYER.setLocY(pY - 1);
						pY -= 1;
					} else if (characters[pX][pY - 1] != null) {
						fightPane.setOpacity(1);
						fightContext.drawImage(DOG.getImg(), 50, 50, 300, 300);
						fightContext.fillText(BOSS_NAME, 320, 100);
					}
				}

				/* level change */
				if (pX == mapStartEnd[currLevel][2] && pY == mapStartEnd[currLevel][3]) {
					currLevel += 1;
					currMap = maps[currLevel];
					drawCharacterLocations();
					pX = mapStartEnd[currLevel][0];
					pY = mapStartEnd[currLevel][1];
					PLAYER.setLocX(pX);
					PLAYER.setLocY(pY);
					drawOpenTwoD();
				}

				if (currMap[pX][pY].getTeleport()) {
					for (int i = 0; i < 10; i++) {
						for (int j = 0; j < 10; j++) {
							if (currMap[j][i].getTeleport() && (pX != j && pY != i)) {
								PLAYER.setLocX(j);
								PLAYER.setLocY(i + 1);
								pX = j;
								pY = i + 1;
								break;
							}
						}
					}
				}

				characters[pX][pY] = PLAYER;
				drawCharactersTwoD();

			}
		});
		
		run.setOnAction(e->{
			fightPane.setOpacity(0);
			clearCanvas(fightContext);
		});
		
	}
	
	private void drawOpenTwoD() {
		clearCanvas(world);
		blackSpace.fillRect(0, 0, 640, 640);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				world.drawImage(currMap[j][i].getImg(), i * 64, j * 64, 64, 64);
			}
		}
	}

	private void drawCharacterLocations() {
		for (int i = 0; i < charPerLevel[currLevel].length; i++) {
			if (charPerLevel[currLevel][i].getName().equals("PLAYER_TILE")) {
				characters[mapStartEnd[currLevel][0]][mapStartEnd[currLevel][1]] = charPerLevel[currLevel][i];
			} else {
				characters[charPerLevel[currLevel][i].getLocX()][charPerLevel[currLevel][i]
						.getLocY()] = charPerLevel[currLevel][i];
			}
		}
	}
	
	private void drawCharactersTwoD() {
		clearCanvas(character);
		/*
		 * for(int i = 0; i<characters.length; i++) {
		 * System.out.println(Arrays.toString(characters[i])); }
		 */
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				try {
					character.drawImage(characters[j][i].getImg(), i * 64, j * 64, 64, 64);
				} catch (Exception e) {
				}
			}
		}
	}

	private void clearCanvas(GraphicsContext c) {
		c.clearRect(0, 0, 640, 640);
	}

}
