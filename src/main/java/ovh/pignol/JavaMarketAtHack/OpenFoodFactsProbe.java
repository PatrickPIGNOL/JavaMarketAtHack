package ovh.pignol.JavaMarketAtHack;

import ovh.pignol.JavaMySQL.MySQLConnection;
import ovh.pignol.JavaSelenium.Chrome;
import ovh.pignol.JavaSelenium.Probe;
import ovh.pignol.JavaSelenium.WebBrowser;

public class OpenFoodFactsProbe extends Probe 
{
	@Override
	public void mProbe() 
	{
		try
		(
			MySQLConnection vConnection = new MySQLConnection
			(
				MarketAtHackPreferences.mInstance().mJDBCMySQLPath(),
				MarketAtHackPreferences.mInstance().mMySQLUser(),
				MarketAtHackPreferences.mInstance().mMySQLPassword()
			)
		)
		{
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			try(WebBrowser vChrome = new Chrome())
			{
				this.mTestSite(vChrome, "https://fr.openfoodfacts.org/");
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
