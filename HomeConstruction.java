import java.util .*;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

class HomeConstructionCostLog
{
	private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
    public void constructionCost(String hstandard, double area, boolean automated)
	{
		double cost=0;
		if(hstandard == "standard" && automated==false)
		{
			cost = area*1200;
		}
		else
		if(hstandard == "above standard" && automated==false)
		{
			cost = area*1500;
		}
		else
		if(hstandard == "high standard" && automated==false)
		{
			cost = area*1800;
		}
		else
		if(hstandard == "high standard" && automated==true)
		{
			cost = area*2500;
		}
		LOGGER.log(Level.INFO, "House Construction Cost is:"+cost);
	}	
}