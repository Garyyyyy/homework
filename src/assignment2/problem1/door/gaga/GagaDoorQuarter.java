package assignment2.problem1.door.gaga;

import assignment2.problem1.door.AbstractDoor;

public class GagaDoorQuarter extends AbstractDoor {
    public GagaDoorQuarter() {
        super(36, 18, "Gaga", "Quarter", true, false);
        super.addColors("brown");
        super.addColors("black");
        super.addColors("bone");
        super.addColors("oxblood");
    }
}
