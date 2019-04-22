package q4a;

import java.util.*;

public class MainDemo {

	public static void main(String[] args){
		
		Student[] s = new Student[5];
		List<Student> ls = new ArrayList<Student>();
		
		s[0] = new Student("Amit",55,1);
		s[1] = new Student("Fmit",65,4);
		s[2] = new Student("Dmit",85,7);
		s[3] = new Student("Smit",25,2);
		s[4] = new Student("Jmit",45,9);
		
		ls.add(s[0]);
		ls.add(s[1]);
		ls.add(s[2]);
		ls.add(s[3]);
		ls.add(s[4]);

		
		Iterator<Student> iter = ls.iterator();
		
	
		while(iter.hasNext()){
				Student t = iter.next();
				System.out.println(t.getMarks());
				
			
				
				if(t.getMarks()<45){
					try {
						throw new StudentException(t.getMarks(), t.getName());
					} catch (StudentException e) {
						
					}
				}
				
			
				
				
		}
		
		
	}
	
}
