package assignment3;

public class Eric_Pettersson_AssignmentTwo {

	public static void main(String[] args) {
		//first constructor 
		Employee employee1 = new Employee();
	    employee1.setName("Susan Meyers");
	    employee1.setPosition("Vice President");
	    employee1.setDepartment("Accounting");
	    employee1.setIdNumber(47899);
	    //second constructor  
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        //third constructor 
        Employee employee3 = new Employee("Joy Rogers", 81774);
        employee3.setDepartment("Manufacturing");
        employee3.setPosition("Engineer");
        //displaying instances
        displayEmployeeData(employee1);
        displayEmployeeData(employee2);
        displayEmployeeData(employee3);
	}
    private static void displayEmployeeData(Employee employee) {
    	//Private method to print empolyeeData
        System.out.println("Name: " + employee.getName());
        System.out.println("ID Number: " + employee.getIdNumber());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("-------------------------");
    }
    
}
