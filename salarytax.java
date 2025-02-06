import java.util.Scanner;
class SalaryTax
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ANNUAL SALARY:");
		double salary= sc.nextDouble();
		if (salary>=1200000 && salary<=1600000) 
		{
			System.out.println("15% tax is "+ (salary*0.15));
			
		}
		else if (salary>1600000 && salary<=2000000) 
		{
			System.out.println("20% tax is "+ (salary*0.2));
			
		}
		else if (salary>2000000 && salary<=2400000) 
		{
			System.out.println("25% tax is "+ (salary*0.25));
			
		}
		
		else if (salary>2400000 ) 
		{
			System.out.println("30% tax is "+ (salary*0.3));
			
		}
		
		else 
		{
			System.out.println("YOUR MOT ILLIGIBALE FOR PAYING TAX.");
		}
        
  }
}