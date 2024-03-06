package oop;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Meshach");
        employee.setAddress("Virginia");
        employee.setAge(29);
        employee.setSalary(10000d);
        employee.setTitle("Java Developer");

        System.out.println(employee.toString());

        //employee.displayEmployeeDetails();

       // System.out.println(employee.getName( "Mathew"));
    }
}
