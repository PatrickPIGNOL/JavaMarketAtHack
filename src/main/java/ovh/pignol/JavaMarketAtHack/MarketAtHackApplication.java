package ovh.pignol.JavaMarketAtHack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import ovh.pignol.JavaSelenium.Probe;

public class MarketAtHackApplication extends Application
{
	private double aYPadding = ((double)25.0);
	private Stage aWindow;
	private Label aPasswordLabel;
	private PasswordField aPasswordField;
	private Button aStartButton;
	private Button aCloseButton;

	@Override
	public void start(Stage pWindow) throws Exception
	{
		this.aWindow = pWindow;
		this.aWindow.setTitle("Market At Hack Selenium Automaton");
		this.aPasswordLabel = new Label("Password");
		this.aPasswordField = new PasswordField();
		this.aPasswordField.setLayoutY(this.aYPadding * 1);
		this.aPasswordField.setAccessibleHelp("Password");
		this.aStartButton = new Button("Start...");
		this.aStartButton.setLayoutY(this.aYPadding * 2);
		this.aStartButton.setDefaultButton(true);
		this.aCloseButton = new Button("Close");
		this.aCloseButton.setLayoutY(this.aYPadding * 3);
		this.aCloseButton.setOnAction
		(
			new EventHandler<ActionEvent>()
			{
				@Override
				public void handle(ActionEvent pEvent)
				{
					mCloseOnAction(pEvent);
				}
			}
		);
		Group vRoot = new Group();
		this.aWindow.setScene(new Scene(vRoot));
		vRoot.getChildren().addAll(this.aPasswordLabel, this.aPasswordField, this.aStartButton, this.aCloseButton);
		this.aWindow.show();
	}
	
	public Stage mWindow()
	{
		return this.aWindow;
	}
	
	public void mCloseOnAction(ActionEvent pEvent)
	{
		this.aWindow.close();
	}
	
	public void mLaunchOnAction(ActionEvent pEvent)
	{
		MarketAtHackPreferences.mInstance().mMySQLPassword(this.aPasswordField.getAccessibleText());		
		try(Probe vOpenFoodFactProbe = new OpenFoodFactsProbe())
		{
			vOpenFoodFactProbe.mStart();
			vOpenFoodFactProbe.mJoin();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
