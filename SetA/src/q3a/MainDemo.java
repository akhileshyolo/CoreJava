package q3a;

import java.util.ArrayList;
import java.util.List;

public class MainDemo {

	
	public static void main(String[] args){
		
		Vehicle[] vk = new Vehicle[5];
		vk[0] = new Vehicle(4260, "Duster", "Petrol", 2002);
		vk[1] = new Vehicle(4260, "Jeep", "Diesel", 2016);
		vk[2] = new Vehicle(4260, "Mercedes", "Diesel", 2010);
		vk[3] = new Vehicle(4260, "BMW", "Petrol", 2004);
		vk[4] = new Vehicle(4260, "Lamborgini", "Diesel", 2018);
		
		List<Vehicle> store = new ArrayList<Vehicle>();
		store.add(vk[0]);
		store.add(vk[1]);
		store.add(vk[2]);
		store.add(vk[3]);
		store.add(vk[4]);
		
		
		FuelRunnable fobj = new FuelRunnable(store);
		YearRunnable yobj = new YearRunnable(store);
		
		Thread a = new Thread(fobj);
		Thread b = new Thread(yobj);
		
		a.start();
		
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
		
		
	}
	
}
