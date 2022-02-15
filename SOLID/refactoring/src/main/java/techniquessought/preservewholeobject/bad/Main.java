package techniquessought.preservewholeobject.bad;

public class Main {

    final DaysTempRange daysTempRange = new DaysTempRange(1,2);
    final Plan plan = new Plan();
    int low = daysTempRange.getLow();
    int high = daysTempRange.getHigh();
    boolean withinPlan = plan.withinRange(low, high);

}

