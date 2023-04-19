package ovh.pignol.JavaMarketAtHack;

public enum EPreferencesFields 
{
	JDBCMySQLPath	("jdbc:mysql://localhost:3306/marketathack"),
	MySQLUser 		("MarketAtHackAdmin"),
	MySQLPassword	("")
	;
	private String aDefault;
	private EPreferencesFields(String pDefault)
	{
		this.aDefault = pDefault;
	}
	public String mDefault()
	{
		return this.aDefault;
	}
}
