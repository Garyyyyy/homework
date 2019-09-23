package assignment2.problem1.cabinet.atreides;

import assignment2.problem1.cabinet.AbstractCabinet;

public class AtreidesQuarter extends AbstractCabinet {
    public AtreidesQuarter() {
        super(26, 18, 16, "Atreides", "Quarter", true, true,true,false, false);
        super.addColors("brown");
        super.addColors("bone");
        int[][] shelvesAndDrawers = {{1,0}};
        super.setShelvesAndDrawers(shelvesAndDrawers);
    }

}
