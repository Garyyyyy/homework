package assignment2.problem1.door.slothrop;

import assignment2.problem1.door.AbstractDoor;

public class SlothropWardrobe extends AbstractDoor {

    public SlothropWardrobe() {
        super(36, 72, "Slothrop", "Wardrobe", true, true);
        super.addColors("brown");
        super.addColors("black");
    }
}
