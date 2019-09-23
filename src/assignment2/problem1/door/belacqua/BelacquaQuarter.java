package assignment2.problem1.door.belacqua;

import assignment2.problem1.door.AbstractDoor;

public class BelacquaQuarter extends AbstractDoor {
    public BelacquaQuarter() {
        super(36, 18, "Belacqua", "Quarter", true, true);
        super.addColors("bone");
        super.addColors("oxblood");
    }
}
