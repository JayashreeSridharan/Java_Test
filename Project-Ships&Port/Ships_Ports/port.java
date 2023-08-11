package Ships_Ports;

import java.util.*;

interface operations{
	public String get_port();
	public void travelPorts(String start,String end, int capacity);
}

public class port {//extends ship{

	ArrayList<String> port_name = new ArrayList<String>
	            (Arrays.asList("chennai","vizag","hyderabad","kolkata"));
	
	static ArrayList<String> cont_det=new ArrayList<String>();
	
	public String get_port() {
		String portList="";
		for(int i=0;i<port_name.size();i++)
		{
			portList += ""+(i+1)+". "+port_name.get(i)+"\n";
		}
		return portList ;
	}


	public void travelPorts(String start,String end, int capacity)
	{
		int s_index=port_name.indexOf(start);
		int e_index=port_name.indexOf(end);
		char choice,oper,type;
		int cont_id,cont_weight,count;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=s_index;i<e_index+1;i++)
		{
			System.out.println("\n**Ship is at port : "+port_name.get(i)+"**");
			System.out.print("Do you want to load or unload? Y/N : ");
			choice=sc.next().charAt(0);
			
			if(choice=='Y') {
				System.out.print("Enter operation : L-Loading / U-Unloading : ");
			    oper=sc.next().charAt(0);
				System.out.println("Enter container id and weight : ");
				cont_id=sc.nextInt();
				cont_weight=sc.nextInt();
			    System.out.print("Enter no. of containers : ");
			    count=sc.nextInt();
				System.out.print("Type of container: R-Refrigerant, L-Liquid, N-Normal: ");
				type=sc.next().charAt(0);
				
				ship sh=new ship(); //ship object
				
				if(oper=='L') {
					sh.load(cont_id,oper,count,capacity,cont_weight,type,port_name.get(i));
				}
				else if(oper=='U') {
					sh.unload(cont_id,oper,count,capacity,cont_weight,type,port_name.get(i));
				}
				
		
			    //sh.cont_load_unload(oper,count,capacity,cont_weight,type);
			    System.out.println("Available containers : heavy - "+sh.heavy+" basic - "+sh.basic);
		
			if(i==e_index)
			{
				System.out.println("*Destination reached!!*\n----Shipment Summary----");
				System.out.println("Total count of containers in ship : "+sh.total_count);
				System.out.println("heavy -> "+(50-sh.heavy)+" basic -> "+(50-sh.basic));
				System.out.println("Fuel consumed : "+sh.total_fuel+" units");
				System.out.println("Cost for the shipping - Rs:"+ sh.fuel_price(sh.total_fuel) +"/-");
						
			}
			else{
				System.out.println("Moving to next port...\n--------------------");
			}
			}
		
		}
	}

}
