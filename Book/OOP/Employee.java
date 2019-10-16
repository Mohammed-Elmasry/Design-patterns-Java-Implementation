public class Employee{
	
	//different/instance vars
	String name;
	int age;
	char sex;
	String position;
	double payRate;
	
	//common vars
	static int vacationDays;
	final static char 	MALE = 'M';
	final static char FEMALE = 'F';

	
	public void list(){
		System.out.println("Name: " +  name);
		System.out.println("Age: " + age);
		System.out.println("Sex " + sex);
		System.out.println("Position: " + position);
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Vacation days: " + vacationDays);
	}
}