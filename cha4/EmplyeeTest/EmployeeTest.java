import java.time.*;

class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String n,double s, int year,int month,int day){
		name = n;
		salary = s;
		//old version : GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		//hireDay = calendar.getTime();
		hireDay = LocalDate.of(year,month,day);
	}

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public LocalDate getHireDay(){
		return hireDay.clone();
	}

	public void raiseSalary(int point){
		salary = salary*(100+point)/100;
	}

	public boolean equals(Employee other){
		return name.equals(other.name);
	}
}

public class EmployeeTest{
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Tom",1000,2014,1,1);
		staff[1] = new Employee("Tim",10000,2016,3,1);
		staff[2] = new Employee("Tina",5000,2018,2,12);

		for(Employee e:staff){
			e.raiseSalary(10);
		}

		for(Employee e:staff){
			System.out.println("name="+e.getName()+",salary="+e.getSalary()
				+",hireDay="+e.getHireDay());
		}
	}
}
