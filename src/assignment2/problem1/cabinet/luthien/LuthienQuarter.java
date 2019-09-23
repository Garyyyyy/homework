package assignment2.problem1.cabinet.luthien;

import assignment2.problem1.cabinet.AbstractCabinet;

public class LuthienQuarter extends AbstractCabinet {
    public LuthienQuarter(){
        super(26, 18, 18, "Luthien", "Quarter", true, false,true,true, false);
        super.addColors("black");
        super.addColors("bone");
        int[][] shelvesAndDrawers = {{3,0}, {1,2}};
        super.setShelvesAndDrawers(shelvesAndDrawers);
    }
}
