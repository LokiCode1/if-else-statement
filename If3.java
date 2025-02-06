import java.util.Scanner;
class IfElse3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1:");
		int num1 = sc.nextInt();              
	    System.out.println("Enter num2:");
		int num2 = sc.nextInt();              
		
	
		if (num1>num2)
		{      
			
			System.out.println(num1 + " is a maximum number. ");
			
		}
		else
		    System.out.println(num2 + " is a maximum number. ");
		
	}
}
