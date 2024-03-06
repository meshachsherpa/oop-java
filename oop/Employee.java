package oop;

public class Employee {
    //Data, fields, attributes
    private String name;
    private String address;
    private Double salary;
    private Integer age;
    private String title;

    public Employee(){
        System.out.println("Inside Employee/Parent constructor:");
    }

    public String getName(String userName){
        if (userName.equals("test")){//This is how we can restric access for security.
            return "";
        }
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", title='" + title + '\'' +
                '}';
    }

    public void displayEmployeeDetails(){
        System.out.println("Name is: "+name);
        System.out.println("Address is: "+address);
        System.out.println("Age is: "+age);
        System.out.println("Salary is: "+salary);
        System.out.println("Title is: "+title);


    }
}
