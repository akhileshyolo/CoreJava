
public class Thread1 extends Thread{

	ThreadVolatile o=null;
	
	public Thread1(ThreadVolatile o) {
		this.o = o;
		
		// TODO Auto-generated constructor stub
	}

	public void run(){
		o.run1();
	}
	
	
}
