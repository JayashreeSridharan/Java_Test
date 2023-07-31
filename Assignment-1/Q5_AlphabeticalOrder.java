import java.util.Arrays;
import java.util.Scanner;

public class Q5_AlphabeticalOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int n=8;
		//int n=5;
		String[] names=new String[n];
		names[0]=sc.nextLine();
		for(int i=1;i<n;i++)
		{
			names[i]=sc.nextLine();
		}
		String t;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n;j++)
			{
				if((names[i].compareTo(names[j]))>0)
				{
					t=names[i];
					names[i]=names[j];
					names[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(names[i]);
		}
		
/*Manoj Kumar
Tom Hanks
Manoj Bajpayee
Tom Cruise
John Wick
Alice Smith
Alice Wonderland
John Cena*/
		
	}

}
