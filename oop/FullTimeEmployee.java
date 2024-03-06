package oop;

public class FullTimeEmployee extends Employee{

    int paidTimeOff;
    double bonus;

    public int getPaidTimeOff() {
        return paidTimeOff;
    }

    public void setPaidTimeOff(int paidTimeOff) {
        this.paidTimeOff = paidTimeOff;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void calculateBonus(float percentage){
        bonus = getSalary()*(percentage/100); //Bonus = 10% of salary.
    }

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setName("Luke");
        fullTimeEmployee.setSalary(10000d);


        fullTimeEmployee.displayEmployeeDetails();
        fullTimeEmployee.calculateBonus(10);

        System.out.println("Your bonus is: "+fullTimeEmployee.getBonus());

    }
}
