import java.util.Arrays;
import java.util.Scanner;

public class Q3_TreasureDivide {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0;i<n;i++)
		{arr[i]=sc.nextInt();}
		Arrays.sort(arr);
		int sum1=0,sum2=0,f=0;
		for(int i=0;i<n-1;i++)
		{
			sum1+=arr[i];
			sum2=0;
			for(int j=i+1;j<n;j++)
			{
				sum2+=arr[j];
			}
			if(sum1==sum2)
			{
				f=1;
				System.out.println("True");
			}
			
		}
		if(f==0)
		{
			System.out.println("False");
		}
	}
}
