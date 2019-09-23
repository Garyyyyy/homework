package assignment2.problem1.drawer;

import assignment2.problem1.AbstractFurniture;


public abstract class AbstractDrawer extends AbstractFurniture {
    private boolean handleRequired;
    private boolean handleIncluded;

    protected AbstractDrawer(){};

    protected AbstractDrawer(int width, int height, String lineName, String size, boolean handleRequired, boolean handleIncluded) {
        super(width,height,lineName,size, "drawer");
        this.handleRequired = handleRequired;
        this.handleIncluded = handleIncluded;
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
}
