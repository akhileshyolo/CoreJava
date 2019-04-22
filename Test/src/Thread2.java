
public class Thread2 extends Thread{

	ThreadVolatile o=null;
	
	public Thread2(ThreadVolatile o) {
		this.o = o;
		
		// TODO Auto-generated constructor stub
	}

	public void run(){
		o.run2();
	}

	
	
}
