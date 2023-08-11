package Ships_Ports;

public abstract class container {
	
	private int cont_id=0;
	int cont_weight=0;
	int cont_count=0;
	char type,oper;
	String curr_port;
	
	public container() {
		super();
	}
	
	public container(int cont_id, int cont_weight, int cont_count, char type, char oper, String curr_port) {
		super();
		this.cont_id = cont_id;
		this.cont_weight = cont_weight;
		this.cont_count = cont_count;
		this.type = type;
		this.oper = oper;
		this.curr_port = curr_port;
	}

	public String get_container(container c) {
		return "cont_id=" + c.cont_id + ", cont_weight=" + c.cont_weight + ", cont_count=" + c.cont_count
				+ ", type=" + c.type + ", oper=" + c.oper + ", current_port=" + c.curr_port + "]";
	}

	public abstract double fuel_consump(int count);
	
    		
}
class basicContainer extends container{

	public double fuel_consump(int count) {
		return 2.0*count;
	}	
}

class heavyContainer extends container{
	
	public double fuel_consump(int count){
		return 2.5*count;
	}
}

class refrigeratedContainer extends heavyContainer{ 
	
	public double fuel_consump(int count) {
		return 3.0*count;
	}
}

class liquidContainer extends heavyContainer{

	public double fuel_consump(int count) {
		return 4.0*count;
	}
	
}