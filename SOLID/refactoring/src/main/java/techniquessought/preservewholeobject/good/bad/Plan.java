package techniquessought.preservewholeobject.good.bad;

public class Plan {

    public boolean withinRange(DaysTempRange daysTempRange) {
        return daysTempRange.getLow() > daysTempRange.getHigh();
    }
}
