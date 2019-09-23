package assignment2.problem1.drawer.gaga;

import assignment2.problem1.drawer.AbstractDrawer;

public class GagaDrawerQuarter extends AbstractDrawer {
    public GagaDrawerQuarter() {
        super(36, 18, "Gaga", "Quarter", true, false);
        super.addColors("brown");
        super.addColors("black");
        super.addColors("bone");
        super.addColors("oxblood");
    }
}
