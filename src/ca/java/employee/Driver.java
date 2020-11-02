package ca.java.employee;
import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {
	
	public static void printInformation(ArrayList<Employee> emp) {
		final String DIVIDER = "----------------------------";
		
		for (Employee e : emp) {
			System.out.println(DIVIDER + "\nName:\t" + e.getFirstName() + " " + e.getLastName() + "\nEmail:\t" + e.getEmail() + "\nPhone#:\t" +
								e.getPhoneNumber() + "\nStart Date:\t" + e.getStartDate() + "\n--->" + e.toString());
		}
		System.out.println(DIVIDER);
	}

	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		
		HourlyEmployee he1 = new HourlyEmployee("Martin", "Garrix", "martin@gmail.com", "021-321-4424", LocalDate.now(), 15.5, 35);
		HourlyEmployee he2 = new HourlyEmployee("Clacin", "Harris", "calvin@gmail.com", "619-915-0199", LocalDate.now(), 25.8, 31);
		SalesEmployee se1 = new SalesEmployee("Adam", "Young", "adam@gmail.com", "144-153-7154", LocalDate.now(), 8.5, 583.5);
		SalesEmployee se2 = new SalesEmployee("Alan", "Walker", "alan@gmail.com", "815-231-9766", LocalDate.now(), 9.8, 825.4);
		
		employeeList.add(he1);
		employeeList.add(he2);
		employeeList.add(se1);
		employeeList.add(se2);
		
		printInformation(employeeList);
		
		
		
	}

}
