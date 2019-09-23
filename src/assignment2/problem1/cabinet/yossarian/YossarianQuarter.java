package assignment2.problem1.cabinet.yossarian;

import assignment2.problem1.cabinet.AbstractCabinet;

public class YossarianQuarter extends AbstractCabinet {
    public YossarianQuarter() {
        super(26, 18, 16,  "Yossarian", "Half", false,true, false, true, false);
        super.addColors("brown");
        super.addColors("black");
        super.addColors("bone");
        int[][] shelvesAndDrawers = {{1,0}};
        super.setShelvesAndDrawers(shelvesAndDrawers);
    }
}
