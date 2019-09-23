package assignment2.problem1.door.gaga;

import assignment2.problem1.door.AbstractDoor;

public class GagaHalf extends AbstractDoor {
    public GagaHalf() {
        super(36, 36, "Gaga", "Half", true, false);
        super.addColors("brown");
        super.addColors("black");
        super.addColors("bone");
        super.addColors("oxblood");
    }
}
