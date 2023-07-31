import java.util.Scanner;

public class Q4_JumpsMinimum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int ind,c=0,index=0;
		while(index<n)
		{
			c+=1;
			int max=0;
			for(int i=index;i<=a[index];i++)
			{
				if(max<a[i])
				{max=a[i];}
			}
			index=index+max;
			
		}
		c+=1;
		System.out.println(c);
		

	}

}
