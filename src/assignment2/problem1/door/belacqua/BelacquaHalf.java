package assignment2.problem1.door.belacqua;

import assignment2.problem1.door.AbstractDoor;

public class BelacquaHalf extends AbstractDoor {
    public BelacquaHalf() {
        super(36, 36, "Belacqua", "Half", true, true);
        super.addColors("bone");
        super.addColors("oxblood");
    }
}
