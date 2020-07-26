import java.util.*;
import java.util.logging.Logger; 

class Calculate {
	double princ, inter;
	double timeP;
	
	Calculate(double princ, double inter, double timeP){
		this.princ = princ;
		this.inter = inter;
		this.timeP = timeP;
	}
	
	double calculateCI() {
		return (princ * (Math.pow(1 + inter / 100, timeP)));
	}

	double CalculateSI() {
		return (princ * inter * timeP) / 100;
	}

}

public class Interest {

	static {
		Scanner sc = new Scanner(System.in);
		Logger logger=Logger.getLogger(Interest.class.getName());
		
		System.out.format("%s", "Enter principle");
		double princ = sc.nextDouble();
		System.out.format("%s", "Enter rate of interest");
		double inter = sc.nextDouble();
		System.out.format("%s", "Enter Time period");
		double timeP = sc.nextDouble();
		
		Calculate con = new Calculate(princ, inter, timeP);
		
		logger.info("1)Calculate Simple Interest 2)Calculate Compound Interest");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			logger.info(String.valueOf(con.CalculateSI()));
			break;
		case 2:			
			logger.info(String.valueOf(con.calculateCI()));
			break;
		}
		sc.close();
	}

	public static void main(String[] args) {

	}

}
