import java.util.Scanner;

public class Q1_Marathon {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);		
		int n;
		while(true) {
			System.out.println("Enter a starting distance(between 5km to 8km)");
		n=sc.nextInt();
		if(n>8 || n<5)
		{
			System.out.println("Sorry, Choose between 5km to 8km");
		}
		else
		{
			System.out.print(n);
			for(int i=n;i>0;i--)
			{
				System.out.println("Distance to run: "+i);
				
				if(i==n-1)
				{System.out.println("Good start, Keep it up!");}
				
				if(i<3 )
				{System.out.println("Almost there!");}
				
				if(i==1)
				{System.out.println("Done for the day!");}
			}
			break;
		}
		}

	}

}
