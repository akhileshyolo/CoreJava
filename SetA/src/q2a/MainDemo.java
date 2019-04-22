package q2a;

import java.util.*;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer num[] = new Integer[10];
		Mango mangoes[] = new Mango[5];
		
		mangoes[0] = new Mango("Kesar",7,700);
		mangoes[1] = new Mango("Badami",6,800);
		mangoes[2] = new Mango("Alphonso",10,100);
		mangoes[3] = new Mango("Totapuri",1,100);
		mangoes[4] = new Mango("Dasheri",5,100);
		
		List<Mango> mangolist = new ArrayList<Mango>();
		
		mangolist.add(mangoes[0]);
		mangolist.add(mangoes[1]);
		mangolist.add(mangoes[2]);
		mangolist.add(mangoes[3]);
		mangolist.add(mangoes[4]);
		
		
		System.out.println("Based on Quality of Mango");
		//Short-hand for
		for(Mango ob : mangolist){
			System.out.println(ob);
		}
		
		
		List<Mango> newmangolist = new ArrayList<Mango>();
		newmangolist.addAll(mangolist);

		
		System.out.println("Based on Price");
		//Short-hand for
		for(Mango ob : newmangolist){
			System.out.println(ob);
		}
		
		
		
		
		
		
		
		
	}

}
