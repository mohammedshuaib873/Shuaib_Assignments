package Java_Assignment5;

import java.util.HashSet;
import java.util.Set;

public class EmployeeObj {

	public static void main(String[] args) {
		Set<Employee> emp=new HashSet<>();
		emp.add(new Employee(101,"Shuaib","Developer",21000));
		emp.add(new Employee(11,"Mani","Tester",15000));
		emp.add(new Employee(18,"Prince","HR",17000));
		
		for(Employee e : emp)
		{
			System.out.println(e);
		}
		
	}
}

class Employee{
	int id;
	String name;
	String dept;
	int salary;
	
		
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee Details [id=" + id + ", name=" + name + ", dept=" +dept +",salary=" + salary + "]";
	}

	public void displayDetails()
	{
		this.toString();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+dept);
	}
}
