package Ships_Ports;

import java.util.ArrayList;
import java.util.Random;

public class ship extends container{
	
	public ship() {
		super();	
	}
	
	public ship(int cont_id, int cont_weight, int cont_count, char type, char oper, String curr_port) {
		super(cont_id, cont_weight, cont_count, type, oper, curr_port);
	}

	static int heavy=50, basic=50;
	static int total_count=0, total_weight=0;
	static double total_fuel=0;
	
	static ArrayList<container> cont_det=new ArrayList<container>();
	
	//ship details
	//String source, dest;
	int ship_id;
	String ship_name;
	int capacity;
	Random random = new Random();   
	public ship(String ship_name, int capacity) {
		super();
		this.ship_id=random.nextInt(1000,2000);
		this.ship_name = ship_name;
		this.capacity = capacity;
	}

	public String get_ship_details(ship s) {
		return "[ship_id = "+s.ship_id+ ", ship_name = " + s.ship_name + ", capacity = " + s.capacity + "]";
	}

	//method loading
	void load(int id,char oper, int count, int capacity, int cont_weight, char type, String c_port)
	{
		container curr_con=new ship(id,cont_weight,count,type,oper,c_port);
		
			if(cont_weight>3000 && total_weight<capacity)
			{
			     if(count>heavy) {
			    	 System.out.println("No Space... Can't load containers");
			     }
			     else {
			    	 heavy -= count;
			    	 total_count += count; total_weight += (count*cont_weight); 
			    	 if(type=='R') 
			    	 {   refrigeratedContainer r=new refrigeratedContainer();
			    		 total_fuel += r.fuel_consump(count);}
			    	 else if(type=='L')
			    	 {   liquidContainer l=new liquidContainer();
			    		 total_fuel += l.fuel_consump(count);}
			    	 else
			    	 {   heavyContainer h=new heavyContainer();
			    		 total_fuel += h.fuel_consump(count);}
			    	 cont_det.add(curr_con);
			     }
			     }		
			else
			{
				if(count>basic) {
					System.out.println("No Space... Can't load containers");
				}
				else {
					 basicContainer b=new basicContainer();
			    	 basic -= count;
			    	 total_count += count; total_weight += (count*cont_weight); 
			    	 total_fuel += b.fuel_consump(count);
			    	 cont_det.add(curr_con);
			     }
			}

			
		}
	
	//method unloading
	void unload(int id,char oper, int count, int capacity, int cont_weight, char type,String c_port)
		{
		    container curr_con=new ship(id,cont_weight,count,type,oper,c_port);
		     
			if(total_count==0)//ship empty
			{ System.out.println("Ship is empty... Can't unload");}
			else if(cont_weight>3000 && total_weight<capacity){
				heavy += count;
				total_count -= count; total_weight -= (count*cont_weight); 
				cont_det.add(curr_con);
			}
			else {
				basic += count;
				total_count -= count; total_weight -= (count*cont_weight); 
				cont_det.add(curr_con);
			} 

			
		}
	
	protected double fuel_price(double total_fuel)
	{
		return total_fuel*500.00;
	}

	public double fuel_consump(int count) {
		return 0;
	}

	
}
