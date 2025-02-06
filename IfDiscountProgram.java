import java.util.Scanner;
class IfDiscountProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Total Bill Amount:");
		
		float totalBill = sc.nextFloat();
		
		if (totalBill>=2000f)
		{
			totalBill = totalBill - (totalBill*25f/100f);
	        System.out.println("Congrats You Got Discount Of 25% And Your Payball Amount is " + totalBill );	
		}
		
		System.out.println("Your Payball Amount is " + totalBill );
	}
}
