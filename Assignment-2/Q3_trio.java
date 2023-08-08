package Assessment_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class sandwich{

	public int sel_sandwich() {
		System.out.println("1. Cheese burger-120 \n 2. Club sandwich-200 \n enter choice : ");
		Scanner sc=new Scanner(System.in);
		int price = 0;
		int c=sc.nextInt();
		if(c==1) 
		{System.out.print("Cheese burger selected\n"); 
		price = 120;}
		else if(c==2)
		{System.out.print("Club sandwich selected\n"); price= 200;}	
		return price;
	}
	
}

class salad extends sandwich{
	public int sel_salad() {
		System.out.println("1. spinach salad-90 \n 2. coleslaw-80 \n enter choice : ");
		Scanner sc=new Scanner(System.in);
		int price = 0;
		int c=sc.nextInt();
		if(c==1) 
		{System.out.print("Spinach salad selected\n"); price= 90;}
		else if(c==2)
		{System.out.print("coleslaw selected\n"); price= 80;}	
		return price;
	}
}

class drink extends salad{
	public int sel_drink() {
		System.out.println("1. orange soda-95 \n 2. cappuchino-85 \n enter choice: ");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int price = 0;
		if(c==1) 
		{System.out.print("orange soda selected\n"); price= 95;}
		else if(c==2)
		{System.out.print("cappuchino selected\n"); price= 85;}	
		return price;
	}
	
}

public class Q3_trio extends drink{

	public static void main(String[] args) {
		
		Q3_trio t=new Q3_trio();
		System.out.println("Choose your trio");
		int[] price=new int[3];
		price[0]=t.sel_sandwich();
		price[1]=t.sel_salad();
		price[2]=t.sel_drink();
		Arrays.sort(price);
		int bill=price[1]+price[2];
		System.out.println("Total Bill :"+bill);
	}

	

}
