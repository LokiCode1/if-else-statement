import java.util.Scanner;
class If2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a paid student ?");
		
		boolean ans = sc.nextBoolean();
		 
		if (ans)
		{
			System.out.println("Pay the fees.");
		}
		
		System.out.println("Do the class.");
	}
}
