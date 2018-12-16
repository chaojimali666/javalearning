import java.time.*;
public class StaticTest{
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Tom",1000,2014,1,1);
		staff[1] = new Employee("Tim",10000,2016,3,1);
		staff[2] = new Employee("Tina",5000,2018,2,12);

		for(Employee e:staff){
			e.setId();
			System.out.println("name="+e.getName()+",salary="+e.getSalary()
				+",hireDay="+e.getHireDay());
		}

		int n = Employee.getNextId();
		System.out.println(n);
	}
}

class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	private int ID ;
	private static int nextID =1;

	public Employee(String n,double s, int year,int month,int day){
		name = n;
		salary = s;
		//old version : GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		//hireDay = calendar.getTime();
		hireDay = LocalDate.of(year,month,day);
		ID =0;
	}

	public void setId(){
		ID = nextID;
		nextID ++;
	}

	public static int getNextId(){
		return nextID;
	}

	public int getId(){
		return ID;
	} 

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public LocalDate getHireDay(){
		return hireDay;
	}

	public void raiseSalary(int point){
		salary = salary*(100+point)/100;
	}

	public boolean equals(Employee other){
		return name.equals(other.name);
	}

	public static void main(String[] args) {
		Employee e = new Employee("Tom",1000,2014,1,1);
		System.out.println(e.getName()+" "+e.getSalary());
	}


}
