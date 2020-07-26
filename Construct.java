package logger;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger; 
public class Construct
{
	int stand,Area;
	Construct(int matstand,int ar)
	{
		stand=matstand;
		Area=ar;
	}
	String calculateCost()
	{
		if(stand==1)
			return("Construction Cost: "+Area*12000);
		else if(standard==2)
			return("Construction Cost: "+Area*15000);
		else if(standard==3)
			return("Construction Cost:"+Area*18000);
		else if(standard==4)
			return("Construction Cost:"+Area*25000);
		else
			return("invalid");
	}
}
