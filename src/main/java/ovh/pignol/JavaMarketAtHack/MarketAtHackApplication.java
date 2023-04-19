package ovh.pignol.JavaMarketAtHack;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class MarketAtHackApplication extends Application
{
	private Stage aWindow;
	private Label aPasswordLabel;
	private PasswordField aPasswordField;

	@Override
	public void start(Stage pWindow) throws Exception
	{
		this.aWindow = pWindow;
		this.aWindow.setTitle("Market At Hack Selenium Automaton");
		this.aPasswordLabel = new Label("Password");
		this.aPasswordField = new PasswordField();
		this.aPasswordField.setAccessibleHelp("Password");
		Group vRoot = new Group();
		this.aWindow.setScene(new Scene(vRoot));
		vRoot.getChildren().addAll(this.aPasswordLabel, this.aPasswordField);
	}
	
	public Stage mWindow()
	{
		return this.aWindow;
	}
	
	
}
