package q2b;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] in = new char[50];
		
		File txtfile = new File("F:\\file.txt");
		
		System.out.println(txtfile.toString());
		
		FileReader fread = null;
		try {
			fread = new FileReader(txtfile);
			BufferedReader br = new BufferedReader(fread);
			
			Stream<String> line = br.lines();


			Object[] lines = line.toArray();
			for( Object temp : lines){
				System.out.println(getWord( Integer.parseInt((String) temp) ));
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	

	}

	
	public static String getWord(int num){
		String s[] = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		return s[num];
	}

	//	public enum Numbers {Zero,One, Two, Three, Four, Five, Six, Seven, Eight, Nine};
	//	public static String getEnumWord(Numbers num){
	
	//	}
	
}
