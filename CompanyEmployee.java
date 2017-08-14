import java.util.*;

public class CompanyEmployee {

	public  void add()
	{
		double sal1,sal2,netSal;
		Scanner digi= new Scanner(System.in);
		sal1=digi.nextDouble();
		sal2=digi.nextDouble();
		netSal=sal1+sal2;
		System.out.println(netSal);
	}
	
	public void add(int sal1, int sal2)
	{
		int netSal=sal1+sal2;
		System.out.println("The net salary is");
		System.out.println(netSal);
	}
	
}

