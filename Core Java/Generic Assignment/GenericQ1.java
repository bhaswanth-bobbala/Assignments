/**
 * Use a HashSet to hold Employee Objects. Upon running the application, the details of the
employees added to the HashSet should be displayed.
Employee <<class>>
 |-- id
 |-- name
 |-- salary
 |-- department
 |-- displayDetails()
Feel free to add properties and methods to Employee Class
Note: if we try to store any object other than Employee Object in HashSet, we should not be
allowed to. 

 */


import java.util.HashSet;
class EmployeeObject{
	static HashSet<Integer> employeeId = new HashSet<>();
	static HashSet<String> employeeName = new HashSet<>();
	static HashSet<Integer> employeeSalary = new HashSet<>();
	static HashSet<String> employeeDepartment = new HashSet<>();
	
	public void addDetails(int id,String name,int salary,String department) {
		
		employeeId.add(id);
		employeeName.add(name);
		employeeSalary.add(salary);
		employeeDepartment.add(department);
	}
	public void displayDetails() {
		System.out.println(employeeId );
		System.out.println(employeeName );
		System.out.println(employeeSalary );
		System.out.println(employeeDepartment );
	}
	
}

public class GenericQ1 {

	public static void main(String[] args) {
		EmployeeObject object = new EmployeeObject();
		object.addDetails(123, "Max", 1000, "EEE");
		object.addDetails(124, "Min", 1100, "ECE");
		object.displayDetails();

	}

}
