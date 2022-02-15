package techniquessought.preservewholeobject.good.bad;

// Source https://refactoring.guru/es/preserve-whole-object
public class Main {

    final DaysTempRange daysTempRange = new DaysTempRange(1,2);
    final Plan plan = new Plan();

    boolean withinPlan = plan.withinRange(daysTempRange);

}

