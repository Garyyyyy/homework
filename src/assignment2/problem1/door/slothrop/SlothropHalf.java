package assignment2.problem1.door.slothrop;

import assignment2.problem1.door.AbstractDoor;

public class SlothropHalf extends AbstractDoor {
    public SlothropHalf() {
        super(36, 36, "Slothrop", "Wardrobe", true, true);
        super.addColors("brown");
        super.addColors("black");
    }
}
