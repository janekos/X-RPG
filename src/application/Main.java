package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	public void changeView(Pane view) {
		view.toFront();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		StackPane root = new StackPane();
		AnchorPane menuView = FXMLLoader.load(getClass().getResource("MenuView.fxml"));
		AnchorPane gameView = FXMLLoader.load(getClass().getResource("GameView.fxml"));
		PlayGame pg = new PlayGame(gameView);
		Pane joinView = FXMLLoader.load(getClass().getResource("JoinView.fxml"));
		root.getChildren().addAll(menuView, gameView, joinView);
		
		/*menu btns*/
		Button newGame = (Button) menuView.lookup("#newGame");
		Button joingame = (Button) menuView.lookup("#joinGame");
		Button about = (Button) menuView.lookup("#about");
		Button exit = (Button) menuView.lookup("#exit");
		
		newGame.setOnAction(e -> {
			changeView(gameView);
			pg.start();
		});		
		joingame.setOnAction(e -> {changeView(joinView);});
		about.setOnAction(e -> {System.out.println("about");});
		exit.setOnAction(e -> {stage.close();});
		
		/*gamebtns*/
		Button backToMenuGame = (Button) gameView.lookup("#backToMenu");
		backToMenuGame.setOnAction(e -> {changeView(menuView);});
		
		/*gamebtns*/
		Button backToMenuJoin = (Button) joinView.lookup("#backToMenuJoin");
		backToMenuJoin.setOnAction(e -> {changeView(menuView);});
		
		changeView(menuView);
		
		Scene scene = new Scene(root,800,660);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setResizable(false);
		stage.setTitle("X-RPG");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
