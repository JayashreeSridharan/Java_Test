package Assessment_2;

import java.util.ArrayList;
import java.util.Scanner;

interface DigitalTree{
	
	public int absorbSunlight(int hours);
}

class BinaryTree implements DigitalTree{
	@Override
	public int absorbSunlight(int hours) {	
		int energy = 2*hours;
		return energy;
	}
	
}

class QuantumTree implements DigitalTree{

	@Override
	public int absorbSunlight(int hours) {
		int energy= (3*hours*hours);
		return energy;
	}

	
}

class NeuralTree implements DigitalTree
{

	@Override
	public int absorbSunlight(int hours) {
		int energy = hours*hours*hours;
		return energy;
	}

}

class forestManager{ 
    }

public class Q4_forestManager {
	int produceEnergyForForest(String[] tree,int hours)
    {
    	int e,total=0;
    	for(int i=0;i<tree.length;i++)
    	{
    		if(tree[i].toString().contains("quantum"))
    		{
    			QuantumTree q=new QuantumTree();
    			e=q.absorbSunlight(hours);
    			total+=e;
    		}
    		else if(tree[i].toString().contains("binary"))
    		{
    			BinaryTree q=new BinaryTree();
    			e=q.absorbSunlight(hours);
    			total+=e;
    		}
    		else if(tree[i].toString().contains("neural"))
    		{
    			NeuralTree n=new NeuralTree();
    			e=n.absorbSunlight(hours);
    			total+=e;
    		}
    		
    	}
    	return total;
    }
    
   void getForestReport(String[] tree,int hours) {
    	String report="";
    	int e,total=0;
    	for(int i=0;i<tree.length;i++)
    	{
    		if(tree[i].toString().contains("quantum"))
    		{
    			QuantumTree q=new QuantumTree();
    			e=q.absorbSunlight(hours);
    			total+=e;
    			report += tree[i].toString()+" energy - "+e+"\n";
    		}
    		else if(tree[i].toString().contains("binary"))
    		{
    			BinaryTree q=new BinaryTree();
    			e=q.absorbSunlight(hours);
    			total+=e;
    			report += tree[i].toString()+" energy - "+e+"\n";
    		}
    		else if(tree[i].toString().contains("neural"))
    		{
    			NeuralTree n=new NeuralTree();
    			e=n.absorbSunlight(hours);
    			total+=e;
    			report += tree[i].toString()+" energy - "+e+"\n";
    		}
    		
    	}
    	System.out.println(report+"Total - "+total);
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   //int n=sc.nextInt();
		   int n=3;
		   String[] tree=new String[n];
		   for(int i=0;i<n;i++)
		   {
		   	tree[i]=sc.nextLine();
		   }
		   System.out.println("Enter hours");
		   int h=sc.nextInt();
		   Q4_forestManager f=new Q4_forestManager();
		   int total_energy= f.produceEnergyForForest(tree,h);
		   System.out.println("Total Energy: "+total_energy);
		   System.out.println("Generating report...");
		   f.getForestReport(tree,h);

	}

}
