public class AutoMobile {
	String color;
	int milesDriven;
	String state = "Shutoff";
	
	//default constructor
	public AutoMobile(){
		System.out.println("Hellow from default constructor");
		this.color = "White";
		this.milesDriven = 0;
		this.state = "Shutoff";
	}
	
	//constructor
	public AutoMobile(String state = "Running"){ //considered as parameterized
		System.out.println("Hello from parameterized constructor");
		color = "red";
		milesDriven = 0;
	}
	
	public void list(){
		System.out.println(this.color);
		System.out.println(String.valueOf(this.milesDriven));
		System.out.println(this.state);
	}
	
	public static void main(String[] args){
		AutoMobile auto1 = new AutoMobile();
		auto1.list();
		AutoMobile auto2 = new AutoMobile("Running");
		auto2.list();
	}

}