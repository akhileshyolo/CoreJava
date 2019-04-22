package q4a;

public class StudentException extends Exception{
	
	private int marks;
	private String message;
	
	StudentException(){
		
	}
	
	StudentException(int marks, String message){
		this.marks = marks;
		this.message = message;
		this.display();
	}

	
	public void display(){
		System.out.println("Exception Occured:"+message+", marks" +marks);
	}
}
