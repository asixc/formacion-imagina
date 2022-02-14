package conditionals.consolidateduplicate.good;

public class Main {

    private static final double EXTRA = 500;
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        sendMessage();
        if(!isEligibleExtraSalary())
            return 0;

        return EXTRA;

    }

    private void sendMessage() {
    	// send email
    	// connect smtp
        System.out.println("Sending message");
    }

    private boolean isEligibleExtraSalary() {
        boolean firstLevel = seniority<1 || education<1;
        boolean secondLevel = incidents > 10 || !certification;

        return  firstLevel || secondLevel;
    }

}
