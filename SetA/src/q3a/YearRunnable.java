package q3a;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class YearRunnable implements Runnable {
	
	List<Vehicle> store;
	
	public YearRunnable(){
		
	}
	
	public YearRunnable(List<Vehicle> store){
		this.store = store;
	}
	
	public void run(){
		
		System.out.println("\n--Vehicles Release Year>2010--");
		Iterator s = store.iterator();
		
		while(s.hasNext()){
			Vehicle v = (Vehicle) s.next();
			if(v.getRelease_year()>2010){
				System.out.println(v.getName());
			}
		}
		
	}

//	public int compare(Vehicle a, Vehicle b) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
