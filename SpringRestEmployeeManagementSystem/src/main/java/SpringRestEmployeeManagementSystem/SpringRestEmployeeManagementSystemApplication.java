package SpringRestEmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringRestEmployeeManagementSystem.model.Employee;
import SpringRestEmployeeManagementSystem.repository.EmployeeRepository;

@SpringBootApplication
public class SpringRestEmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringRestEmployeeManagementSystemApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeerepository;
	@Override
	public void run(String... args) throws Exception {
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		  Employee e1 = new Employee("Shuaib", "Developer", "AnalystA4", 180000);
		  Employee e2 = new Employee("Prince", "Developer", "AnalystA4", 180000);
		  Employee e3 = new Employee("Aayushi", "Developer", "AnalystA4", 180000);
		  Employee e4 = new Employee("Shashank", "Developer", "AnalystA4", 180000);
		  Employee e5 = new Employee("Arjun", "Developer", "AnalystA4", 180000);
		  Employee e6 = new Employee("Rohan", "Developer", "AnalystA4", 180000);
		  Employee e7 = new Employee("Shweta", "Developer", "AnalystA4", 180000);
		  Employee e8 = new Employee("Ashraf", "Developer", "AnalystA4", 180000);
		  Employee e9 = new Employee("Shalini", "Developer", "AnalystA4", 180000);
		  Employee e10 = new Employee("Ajay", "Developer", "AnalystA4", 180000);
		  
		  listOfEmployees.add(e1);
		  listOfEmployees.add(e2);
		  listOfEmployees.add(e3);
		  listOfEmployees.add(e4);
		  listOfEmployees.add(e5);
		  listOfEmployees.add(e6);
		  listOfEmployees.add(e7);
		  listOfEmployees.add(e8);
		  listOfEmployees.add(e9);
		  listOfEmployees.add(e10);
		  
		  employeerepository.insert(listOfEmployees);
		
	}

}
