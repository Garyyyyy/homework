package assignment2.problem1.cabinet.yossarian;

import assignment2.problem1.cabinet.AbstractCabinet;

public class
YossarianWardrobe extends AbstractCabinet {

    public YossarianWardrobe() {
        super(36, 72, 16,  "Yossarian", "Wardrobe", false,false,true, false, true);
        super.addColors("brown");
        super.addColors("black");
        super.addColors("bone");
        super.addColors("oxblood");
        int[][] shelvesAndDrawers = {{7,0}};
        super.setShelvesAndDrawers(shelvesAndDrawers);
    }
}
