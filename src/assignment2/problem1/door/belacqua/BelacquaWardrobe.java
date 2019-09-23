package assignment2.problem1.door.belacqua;

import assignment2.problem1.door.AbstractDoor;

public class BelacquaWardrobe extends AbstractDoor {
    public BelacquaWardrobe() {
        super(36, 72, "Belacqua", "Wardrobe", true, true);
        super.addColors("bone");
        super.addColors("oxblood");
    }
}
