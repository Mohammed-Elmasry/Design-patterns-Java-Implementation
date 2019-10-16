public class EmployeeTest{
	public static void main(String[] args){
	Employee jack = new Employee();
	jack.name = "Jack";
	jack.age  = 26;
	jack.sex  = Employee.MALE;
	jack.position = "Water Gopher";
	jack.payRate = 5.00;
	jack.vacationDays = 10;
	jack.list();
	
	Employee jill = new Employee();
	jill.name = "Jill";
	jill.age = 22;
	jill.sex = Employee.FEMALE;
	jill.position = "Assistant Water Gopher";
	jill.payRate = 4.75;
	//changing static will change all instances' static referencing
	jill.vacationDays = 11;
	jill.list();
	
	System.out.println("I am jack's vacation days: " + jack.vacationDays);
	Employee.vacationDays = 15;
	System.out.println("jack's vacationDays: " + jack.vacationDays);
	System.out.println("jill's vacationDays: " + jill.vacationDays);
	
	
};
