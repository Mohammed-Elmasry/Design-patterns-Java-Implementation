public class MultiThreadTest extends Thread{
	public void run(){
		for (char a = 'A'; a <= 'J'; a++){
			System.out.println(a);
		}
	}
	
	public static void main(String[] args){
		MultiThreadTest test = new MultiThreadTest();
		test.start();
		for(int i = 0; i < 11; i++){
			System.out.println(i);
		}
	}
	
}