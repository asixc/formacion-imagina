package conditionals.consolidatedconditional.good;

public class Main {
	
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        if (hasRightToExtraSalary())
            return this.extraSalary;

        return 0;
    }

    private boolean hasRightToExtraSalary() {
        return hasMinimumRightsToExtraSalary() || hasMinimumExperience();
    }

    private boolean hasMinimumExperience() {
        return seniority >= 1 || education >= 1;
    }

    private boolean hasMinimumRightsToExtraSalary() {
        return incidents < 10 || certification;
    }

}
