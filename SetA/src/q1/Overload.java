package q1;

class Overload {

	
	public void sum(int num1, int num2){
		System.out.println(num1+num2);
	}

	public void sum(float num1, float num2){
		System.out.println(num1+num2);
	}
	
	public void sum(int num1, double num2){
		System.out.println(num1+num2);
	}
	
	public void sum(String s1, String s2){
		System.out.println(s1+s2);
	}
	
	
}
