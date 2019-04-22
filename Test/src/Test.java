public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ThreadVolatile ob1 = new ThreadVolatile();
		Thread1 a = new Thread1(ob1);
		Thread2 b = new Thread2(ob1);
		
		
		
		b.start();
		a.start();
		
	}




}
