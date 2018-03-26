
import java.util.Scanner;
import java.util.Random;
public class Driver { 
 
//main
public static void main( String[] args ) throws InterruptedException {
	
	//Random Function
	Random rand = new Random();
	
	String command;
	Scanner key = new Scanner( System.in );
	 
	System.out.println( "Enter a command: " );
	command = key.nextLine();
	
	int userPoints=0;
	int compPoints =0;
	
	while( !command.equals("quit"))
	{
		int  n = rand.nextInt(3) + 1;
	if(command.equals("rock"))
	{
		System.out.println("You typed in:" + command);
		if(n==3)
		{
			System.out.println("The Computer played: Sissors");
			System.out.println("You won a point!");
			userPoints++;
		}
		else if (n==2)
		{
			System.out.println("The Computer played: Paper");
			System.out.println("The computer won a point!");
			compPoints++;
		}
		else
		{
			System.out.println("The Computer played: Rock");
			System.out.println("Its a Tie! No Points.");
		}
	}
	else if(command.equals("sissors"))
	{
		System.out.println("You typed in:" + command);
		if(n==2)
		{
			System.out.println("The Computer played: Paper");
			System.out.println("You won a point!");
			userPoints++;
		}
		else if (n==1)
		{
			System.out.println("The Computer played: Rock");
			System.out.println("The computer won a point!");
			compPoints++;
		}
		else
		{
			System.out.println("The Computer played: Sissors");
			System.out.println("Its a Tie! No Points.");
			
		}
	}
	else if(command.equals("paper"))
	{
		System.out.println("You typed in:" + command);
		if(n==1)
		{
			System.out.println("The Computer played: Rock");
			System.out.println("You won a point!");
			userPoints++;
		}
		else if (n==3)
		{
			System.out.println("The Computer played: Sissors");
			System.out.println("The computer won a point!");
			compPoints++;
		}
		else
		{
			System.out.println("The Computer played: Paper");
			System.out.println("Its a Tie! No Points.");
		}
	}
	else
	{
		System.out.println("This is not a Rock Paper Sissors command.");
	}
	System.out.println("Your Points:" + userPoints);
	System.out.println("Computer's points:" +compPoints);
	System.out.println("Enter another command: ");
	command = key.nextLine();
}
	System.out.println("Thank you for playing!");
	if(userPoints> compPoints)
	{
		System.out.println("You Won!");
	}
	else if (userPoints < compPoints )
	{
		System.out.println("The Computer Won!");
	}
	else
	{
		System.out.println("Its a Tie!");
	}
	 
	 
	 
	key.close();
	 

}
}