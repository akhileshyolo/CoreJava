import java.util.concurrent.atomic.AtomicInteger;


public class ThreadVolatile extends Thread {

	AtomicInteger x = new AtomicInteger(0);
	boolean flag=true;
	
	public void run1(){
		
		while(flag){
			
			try {
				Thread.currentThread().sleep(3000);
				System.out.println("Run1........: "+ (x.incrementAndGet()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//			System.out.println("Run1..........: "+x++);
//			x = 10;
//			flag=false;

	}
	
	public void run2(){
		while(flag){
			
			try {
				Thread.currentThread().sleep(1000);
				System.out.println("Run2........: "+ (x.incrementAndGet()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
