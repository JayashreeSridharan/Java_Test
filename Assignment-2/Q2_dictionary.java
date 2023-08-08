package Assessment_2;

import java.util.Scanner;

public class Q2_dictionary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x,y;
		String[] dict=new String[n];
		for(int i=0;i<n;i++)
		{
			dict[i]=sc.next();
		}
		String order=sc.next();
		char[] o=order.toCharArray();
		char[] first=new char[n];
		String m="";
		for(int i=0;i<n;i++)
		{
			first[i]=dict[i].charAt(0);
			if(!(m.contains(first[i]+"")))
				m+=first[i];
		}
		String k1="";
		for(char i:o)
		{
			if(m.contains(i+"")) {k1+=i;}
		}
		String s=first.toString();
		if(s.equals(k1)) {System.out.println(1);}
		else
		{System.out.println(0);}
		
	}

}
