import java.util.*;
import java.util.Scanner;

public class Q2_ProfitLoss {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			sum=0;
			for(int j=i+1;j<n;j++)
			{
				sum+=a[j];
				arr.add(sum);
			}
				
		}
		//System.out.println(arr);
		System.out.println(Collections.max(arr));		
	}

}
