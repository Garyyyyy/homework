package assignment2.problem1.cabinet.yossarian;

import assignment2.problem1.cabinet.AbstractCabinet;

public class YossarianHalf  extends AbstractCabinet {
    public YossarianHalf() {
        super(36, 36, 16, "Yossarian", "Half", true, false,true,true, false);
        super.addColors("brown");
        super.addColors("black");
        super.addColors("bone");
        int[][] shelvesAndDrawers = {{3,0}};
        super.setShelvesAndDrawers(shelvesAndDrawers);
    }
}
