package Assessment_2;

import java.util.Scanner;

interface AdvancedArithmetic{
	
	int divisor_sum(int n);
}

public class Q1_divisorSum implements AdvancedArithmetic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Q1_divisorSum d=new Q1_divisorSum();
		int div_sum=d.divisor_sum(n);
		System.out.println(div_sum);

	}

	@Override
	public int divisor_sum(int n) {
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) {
				sum += i;
			}
		}
		return sum;
	}

}
