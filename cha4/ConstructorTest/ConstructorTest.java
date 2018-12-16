import java.util.*;

public class ConstructorTest{
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];

		staff[0] =new Employee("Harry",4000);
		staff[1] =new Employee(60000);
		staff[2] =new Employee();

		for (Employee e: staff){
			System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
		}
	}
}

class Employee{
	private  static int nextId;

	private int id;
	private String name="";
	private double salary;

	static{
		Random generator = new Random();
		nextId = generator.nextInt(1000);
	}

	{
		id = nextId;
		nextId ++;
	}

	public Employee(double s){
		this("Employee #"+nextId,s);
	}

	public Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}

	public Employee(){

	}

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public int getId(){
		return id;
	}

	public void raiseSalary(int point){
		salary = salary*(100+point)/100;
	}

	public boolean equals(Employee other){
		return name.equals(other.name);
	}
}