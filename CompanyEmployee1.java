
public class CompanyEmployee1 extends CompanyEmployee
{
	public void add(int sal1, int sal2)
	{
		super.add(10,20);
	System.out.println("Hello Employee");	
	}
	
	public static void main(String[] args)
	{
		CompanyEmployee1 obj= new CompanyEmployee1();
		CompanyEmployee e= new CompanyEmployee();
		obj.add(10,20);
		e.add(10,20);
		
	}

}
