//creating a thread
//note that any object from ThreadTest is a thread
public class ThreadTest extends Thread{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		
		//creating instance of ThreadTest and not from Thread itself.
		ThreadTest test = new ThreadTest();
		test.start();
	}
}