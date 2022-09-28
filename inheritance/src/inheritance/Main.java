package inheritance;

// miras bırakmak anlamına gelir
// yani employee ve customerda aynı şeyler olduğu için kendimizi tekrarlamamak adına 
// public class Customer extends Person gibi bir kalıp kullanarak daha basit bir şekilde işimizi kolaylaştırabiliriz.
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();

		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

		employeeManager.List();
		customerManager.Add();

	}

}
