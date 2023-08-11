package Ships_Ports;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//System.out.println(ship_id+" "+source+" "+dest+" "+capacity);
		ship sh=new ship();
		port ports=new port();

   		ArrayList<ship> ship_det=new ArrayList<>();
		boolean c=true;
		int choice;		
		System.out.println("******Shipping Management******");
	
   		while(c) {
   	
		System.out.println("----Main Menu----\nChoose 1. Admin 2. Customer 3. Exit");
		int menu=sc.nextInt();
		
		//admin
		if(menu==1) {
			System.out.println("---Admin Menu---\nEnter 1. Add ship 2. Display Ship 3. Display container history");
			System.out.print("\nEnter choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1: {
				//add ship
				System.out.println("Enter ship_name: ");
		    	String name=sc.next();
		    	System.out.println("Enter ship capacity : ");
			   	int capacity=sc.nextInt();
			   	ship_det.add(new ship(name,capacity));
			   	System.out.println("Ship added!");
			   	break;
			}
			case 2: {
				//display ship
		    	   if(ship_det.isEmpty()) {
		    		   System.out.print("No ships to display");
		    	   }
		    	   else {
		    		   System.out.println("--------Ship Details-------");
		    		   for(int i=0;i<ship_det.size();i++) 
		    		   {System.out.println("Ship_"+(i+1)+" "+ sh.get_ship_details(ship_det.get(i)));}
		    	   }
		    	   break;
			}
			case 3:{
				//display container history
				   if(sh.cont_det.isEmpty()) {
		    		   System.out.println("No containers to display");
		    	   }
		    	   else {
		    	   System.out.println("--------Container History-------");
	    		   for(int i=0;i<sh.cont_det.size();i++) 
	    		   {System.out.println(""+(i+1)+" "+sh.get_container(sh.cont_det.get(i)));}
	    		   }
		    	   break;	
			}
		}}
		else if(menu==2) {//customer
			System.out.println("----Customer Menu----\n1. Shipping Containers 2. View Ports 3. View Ships ");
			System.out.print("\nEnter choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:{
				//shipping containers
				System.out.print("Route of ports: ");
				for(int i=0;i<ports.port_name.size();i++)
				{
					System.out.print("->"+ports.port_name.get(i)+" ");
				}
				System.out.println();
				String source, dest;   
		   		System.out.print("Enter From Port : ");
		   		source=sc.next();
		   		System.out.print("Enter Destination Port: ");
		   		dest=sc.next();
		   		if(ship_det.isEmpty())
		   		{
		   			System.out.println("--Ships not available... Contact Admin--");
		   		}
		   		else
		   		{
		   		    for(int i=0;i<ship_det.size();i++)
		   		    {
		   		    	System.out.println("Ship_no:"+(i+1)+". "+sh.get_ship_details(ship_det.get(i))+"\n");
		   		    }
		   		    System.out.println("Enter ship number: ");
		   		    int s_c=(sc.nextInt()-1);
		   		
		   		//ship_det.add(sh);
		   		if(ports.port_name.contains(source) && ports.port_name.contains(dest))
		   		{
		   		if(ports.port_name.indexOf(dest) < ports.port_name.indexOf(source)) {
		   			System.out.println("Destination is not in route of ship");
		   		}
		   		else {
		   			ports.travelPorts(source, dest, ship_det.get(s_c).capacity);	
		   		}	
		   		} 
		   		else {System.out.println("Enter valid port name....");} }
		   		break;
			}
			case 2:{
				//view ports
				System.out.println("---List of ports---");
		    	System.out.println(ports.get_port());
		    	break;
			}
			case 3:{
				//view ship
		    	   if(ship_det.isEmpty()) {
		    		   System.out.print("No ships to display");
		    	   }
		    	   else {
		    		   System.out.println("--------Ship Details-------");
		    		   for(int i=0;i<ship_det.size();i++) 
		    		   {System.out.println("Ship_"+(i+1)+" "+ sh.get_ship_details(ship_det.get(i)));}
		    	   }
		    	   break;
			}
			}	
		}
		else if(menu==3) {
			c=false;
			System.out.println("Exiting...");
		}		
	}
	}

}



//Integer cont_weight;
//char cont_type;
//System.out.print("Enter container weight : ");
//cont_weight=sc.nextInt();
//System.out.print("Enter container type : L-Liquid , R-Refrigerant");
//cont_type=sc.next().charAt(0);
//container con=new container(cont_weight)
//System.out.println(ship_id+" "+source+" "+dest+" "+capacity);