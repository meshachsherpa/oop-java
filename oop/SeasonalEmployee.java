package oop;

public class SeasonalEmployee extends PartTimeEmployee{

    private String season;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void test(){

    }

    public static void main(String[] args) {
        SeasonalEmployee seasonalEmployee = new SeasonalEmployee();
        seasonalEmployee.test();
    }
}
