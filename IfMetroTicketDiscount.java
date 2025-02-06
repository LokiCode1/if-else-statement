import java.util.Scanner;
class MetroTicketDiscount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Ticket Amount:");
		float ticket = sc.nextFloat();
		
		System.out.println("Do You Have Student ID With You? ");
		boolean id= sc.nextBoolean();
		
		if (id)
		{
			ticket-= (ticket*10/100);
			System.out.println("Congrats You Got Dicount 10%");
			
		}
		System.out.println("Your Total Ticket prizeis "+ ticket);
		
	}
}
