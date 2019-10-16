public class TestRunnable implements Runnable{
	//defining logic in run()
	public void run(){
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		TestRunnable t = new TestRunnable(); //runnable object to pass to thread constructor
		Thread test = new Thread(t);
		test.start();
	}
}