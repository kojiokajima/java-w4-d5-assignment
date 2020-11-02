package ca.java.employee;
import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {
	
	public static void printInformation(ArrayList<Employee> emp) {
		final String DIVIDER = "----------------------------";
		
		for (Employee e : emp) {
			System.out.println(DIVIDER + "\nName:\t\t" + e.getFirstName() + " " + e.getLastName() + "\nEmail:\t\t" + e.getEmail() + "\nPhone#:\t\t" +
								e.getPhoneNumber() + "\nStart Date:\t" + e.getStartDate() + "\n-->" + e.toString());
		}
		System.out.println(DIVIDER);
	}

	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		
		HourlyEmployee he1 = new HourlyEmployee("Martin", "Garrix", "martin@gmail.com", "021-321-4424", LocalDate.of(2016, 8, 20), 15.5, 35);
		HourlyEmployee he2 = new HourlyEmployee("Clacin", "Harris", "calvin@gmail.com", "619-915-0199", LocalDate.of(2019, 7, 10), 25.8, 31);
		SalesEmployee se1 = new SalesEmployee("Adam", "Young", "adam@gmail.com", "144-153-7154", LocalDate.of(2017, 10, 10), 8.5, 583.5);
		SalesEmployee se2 = new SalesEmployee("Alan", "Walker", "alan@gmail.com", "815-231-9766", LocalDate.of(2020, 8, 31), 9.8, 825.4);
		
		employeeList.add(he1);
		employeeList.add(he2);
		employeeList.add(se1);
		employeeList.add(se2);
		
		printInformation(employeeList);
		
		
		
	}

}
