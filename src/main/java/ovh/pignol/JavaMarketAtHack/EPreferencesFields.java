package ovh.pignol.JavaMarketAtHack;

public enum EPreferencesFields 
{
	JDBCMySQLPath	("JDBCMySQLPath","jdbc:mysql://localhost:3306/marketathack"),
	MySQLUser 		("MySQLUser","MarketAtHackAdmin"),
	MySQLPassword	("Password", "")
	;
	
	private String aFieldName;
	private String aDefault;
	
	private EPreferencesFields(String pFieldName, String pDefault)
	{
		this.aFieldName = pFieldName;
		this.aDefault = pDefault;
	}
	
	public String mFieldName()
	{
		return this.aFieldName;
	}
	
	public String mDefault()
	{
		return this.aDefault;
	}
}
