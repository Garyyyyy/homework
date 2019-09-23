package assignment2.problem1.cabinet.luthien;

import assignment2.problem1.cabinet.AbstractCabinet;

public class LuthienHalf extends AbstractCabinet {
    public LuthienHalf(){
        super(36, 36, 18, "Luthien", "Half", true, false,true,true, false);
        super.addColors("black");
        super.addColors("bone");
        int[][] shelvesAndDrawers = {{3,0}, {1,2}};
        super.setShelvesAndDrawers(shelvesAndDrawers);
    }
}
