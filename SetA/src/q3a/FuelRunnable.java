package q3a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FuelRunnable implements Runnable {
	
	List<Vehicle> store = null;
	
	public FuelRunnable(){
		
	}

	public FuelRunnable(List<Vehicle> store){
		this.store = store;
	}
	
	public void run() {
	
		System.out.println("--Print only Petrol Vehicles--");
		Iterator s = store.iterator();
		
		while(s.hasNext()){
			Vehicle v = (Vehicle) s.next();
			if(v.getVehicle_type().equals("Petrol")){
				System.out.println(v.getName());
			}
		}
	}

	
	//ignore
//	public int compare(Vehicle a, Vehicle b) {
//		// TODO Auto-generated method stub
//		
//			return a.getVehicle_type().compareTo(b.getVehicle_type());
//		
//		
//	}

}
