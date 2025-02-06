import java.util.Scanner;
class IfScholership 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Total Fees:");
		float fees = sc.nextFloat();
		System.out.println("Entre Anuale Income of Your family:");
		float income = sc.nextFloat();
		
		if (income<=250000f)
		{
			System.out.println("congrats you are eligible for scholership and You got 25% discount of total fees.");
			fees -= (fees*25f/100f);
			
		}
		System.out.println("Your Total Fees is "+ fees);
	}
}
