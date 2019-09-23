package assignment2.problem1.door;

import assignment2.problem1.AbstractFurniture;
import assignment2.problem1.drawer.AbstractDrawer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDoor extends AbstractFurniture {
    private boolean handleRequired;
    private boolean handleIncluded;
    private List<AbstractDrawer> drawerList;

    protected AbstractDoor(){};

    protected AbstractDoor(int width, int height, String lineName, String size, boolean handleRequired, boolean handleIncluded) {
        super(width,height,lineName,size, "door");
        this.handleRequired = handleRequired;
        this.handleIncluded = handleIncluded;
        this.drawerList = new ArrayList<>();
    }

    public int getWidth() {
        return super.getWidth();
    }

    public void setWidth(int width) {
        super.setWidth(width);
    }

    public int getHeight() {
        return super.getHeight();
    }

    public void setHeight(int height) {
        super.setHeight(height);
    }

    public boolean getHandleRequired() {
        return handleRequired;
    }

    public void setHandleRequired(boolean handleRequired) {
        this.handleRequired = handleRequired;
    }

    public boolean isHandleIncluded() {
        return handleIncluded;
    }

    public void setHandleIncluded(boolean handleIncluded) {
        this.handleIncluded = handleIncluded;
    }

    public boolean checkColors(String color) {
        return super.checkColors(color);
    }

    public void addColors(String color) {
        super.addColors(color);
    }

    public List<String> getAddtionals() {
        return super.getAdditionals();
    }

    public void addAdditionals() {

        if(handleRequired && !handleIncluded){
            super.addAdditionals("Door handles");
        }
        super.addAdditionals("Door hinges");

    }

    public void matchDrawer(String targetColor, List<AbstractDrawer> drawers){
        for(AbstractDrawer drawer : drawers){
            if(drawer.getHeight() < this.getHeight() && drawer.getWidth() <= this.getWidth() && drawer.checkColors(targetColor)){
                this.drawerList.add(drawer);
                drawer.addAddtionals();
            }
        }
    }
}
