package assignment2.problem1.cabinet.atreides;

import assignment2.problem1.cabinet.AbstractCabinet;

public class AtreidesHalf extends AbstractCabinet {
    public AtreidesHalf() {
        super(36, 36, 16, "Atreides", "Half", true, false,true,false, false);
        super.addColors("brown");
        super.addColors("bone");
        int[][] shelvesAndDrawers = {{3,0}};
        super.setShelvesAndDrawers(shelvesAndDrawers);
    }
}
