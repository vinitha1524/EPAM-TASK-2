import java.util .*;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

class SimpleAndCompoundInterestLog
{
	private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
    public void simpleInterest(double pr, double rate, double time)
	{
		double simple;
				
		simple=(pr * time * rate)/100;
		
		LOGGER.log(Level.INFO, "Simple Interest is:"+simple);
	}
	public void compoundInterest(double pr, double rate, double time)
	{
		double compound;
				
		compound=pr * Math.pow(1.0+rate/100.0,time) - pr;
		
		LOGGER.log(Level.INFO, "Compound Interest is:"+compound);
	}
}