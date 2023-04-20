package ovh.pignol.JavaMarketAtHack;

import java.util.prefs.Preferences;

public class MarketAtHackPreferences 
{
	private static class PreferencesHolder
	{
		private static MarketAtHackPreferences sPreferences = null;
		public static MarketAtHackPreferences mInstance()
		{
			if(PreferencesHolder.sPreferences == null)
			{
				PreferencesHolder.sPreferences = new MarketAtHackPreferences();
			}
			return PreferencesHolder.sPreferences;
		}
	}
	
	public static MarketAtHackPreferences mInstance()
	{
		return PreferencesHolder.mInstance();
	}
		
	private Preferences aPreference;
	private String aJDBCMySQLPath;
	private String aMySQLUser;
	private String aMySQLPassword;
	
	private MarketAtHackPreferences()
	{
		this.aPreference = Preferences.userNodeForPackage(this.getClass());
		this.aJDBCMySQLPath = this.aPreference.get
		(
			EPreferencesFields.JDBCMySQLPath.mFieldName(), 
			EPreferencesFields.JDBCMySQLPath.mDefault()
		);
		this.aMySQLUser = this.aPreference.get
		(
			EPreferencesFields.MySQLUser.mFieldName(), 
			EPreferencesFields.MySQLUser.mDefault()
		);
		this.aMySQLPassword = this.aPreference.get
		(
			EPreferencesFields.MySQLPassword.mFieldName(), 
			EPreferencesFields.MySQLPassword.mDefault()
		);
	}
	public String mJDBCMySQLPath()
	{
		return this.aJDBCMySQLPath;
	}
	public String mMySQLUser()
	{
		return this.aMySQLUser;
	}
	public void mMySQLUser(String pValue)
	{
		this.aPreference.put
		(
			EPreferencesFields.MySQLUser.mFieldName(),
			this.aMySQLUser = pValue
		);
	}
	public String mMySQLPassword()
	{
		return this.aMySQLPassword;
	}
	public void mMySQLPassword(String pValue)
	{
		this.aPreference.put
		(
			EPreferencesFields.MySQLPassword.mFieldName(),
			this.aMySQLPassword = pValue
		);
	}
}
