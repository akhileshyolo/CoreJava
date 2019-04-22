package q2a;

import java.util.Comparator;

public class MangoComparator implements Comparator<Mango>{

	public int compare(Mango a, Mango b) {
		Integer p1 = new Integer(a.getPrice());
		Integer p2 = new Integer(b.getPrice());
	
		//Integer Wrapper class based comparsion
		//You can have custom ifelse type comparison logic
		
		return p1.compareTo(p2);
	
	}	
	
}
