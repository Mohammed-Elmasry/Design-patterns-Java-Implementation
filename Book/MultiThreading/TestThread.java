public class TestThread {
	
	public static void main(String[] args){
		MultipleThreads mt = new MultipleThreads(){
			public void run(){
				for(int i = 1; i < 11 ; i++){
					System.out.println(i);
				}
			}
		};
		
		MultipleThreads mt2 = (new MultipleThreads(){
			public void run(){
				for(char a = 'A'; a < 'Z'; a++){
					System.out.println(a);
				}
			}
		});
		mt.start();
		mt2.start();
	}
}