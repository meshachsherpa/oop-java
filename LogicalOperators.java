public class LogicalOperators {
    public static void main(String[] args) {
        boolean parentsAllowed = false, hasMoney = true;
        boolean goingToTrip = false  ;
        if(parentsAllowed && hasMoney ){
            goingToTrip = true;
        }
        System.out.println("Am i going to trip? " +goingToTrip);
        /*boolean isRaining = true;
        System.out.println(!isRaining);*/
    }
}
