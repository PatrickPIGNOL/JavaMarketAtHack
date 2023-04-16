package ovh.pignol.JavaMarketAtHack;

import ovh.pignol.JavaSelenium.Probe;

public class App 
{
    public static void main( String[] args )
    {
    	Probe vProbe = new OpenFoodFactsProbe();
    	vProbe.mStart();
    }
}
