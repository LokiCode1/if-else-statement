import java.util.Scanner;
class IfRocketLounch 
{
	public static void main(String[] args) 
	{
		Scanner sv = new Scanner(System.in);
		System.out.println("Enter The Speed of Rocket in KM/H");
		
		float speed = sv.nextFloat();
		if (speed<2000f)
		{
			System.out.println("Rocket's Speed Less Than 2000 KM/H Please Increase Your Speed.");
		}
		System.out.println("Lounch The Rocket");
	}
}
