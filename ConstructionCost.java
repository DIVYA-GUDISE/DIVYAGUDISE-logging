package logger;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger; 
public class ConstructionCost {
	static
	{
		Logger logger=Logger.getLogger(ConstructionCost.class.getName());
		Scanner sc=new Scanner(System.in);
		int matstand;
    int ar;
		String msg;
		logger.info("Enter Material Standard\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");
		matstand=sc.nextInt();
		if(matstand==1||matstand==2||matstand==3||matstand==4)
		{
			logger.info("Enter area of the house in sq.ft");
			ar=sc.nextInt();
			Construct con=new Construct(matstand,ar);
			msg=con.calculateCost();
			logger.info(msg);
		}
		else
		{
			logger.info("invalid selection");
			java.lang.System.exit(0); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
