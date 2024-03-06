package oop;

public class PartTimeEmployee extends Employee{
    //PartTimeEmployee = child Class
    //Employee = Parent Class

    private Float perHourRate = 60F;
    private Float noOfHoursWorked;

    public PartTimeEmployee(){
        super(); // It calls the parent's constructor.
        System.out.println("Inside PartTimeEmployee/Child constructor");
    }

    public Float getPerHourRate() {
        return perHourRate;
    }

    public void setPerHourRate(Float perHourRate) {
        this.perHourRate = perHourRate;
    }

    public Float getNoOfHoursWorked() {
        return noOfHoursWorked;
    }

    public void setNoOfHoursWorked(Float noOfHoursWorked) {
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public void calculateTotalEarnings(){
        System.out.println("Total earning: $"+(perHourRate*noOfHoursWorked));
    }


    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setAge(30);
        partTimeEmployee.setName("John");
        partTimeEmployee.setAddress("Boston");
        partTimeEmployee.setSalary(50000d);
        partTimeEmployee.setTitle("Preacher");

        System.out.println(partTimeEmployee.toString());

        partTimeEmployee.setNoOfHoursWorked(42F);
        partTimeEmployee.calculateTotalEarnings();
    }
}
