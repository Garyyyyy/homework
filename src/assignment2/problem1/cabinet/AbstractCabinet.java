package assignment2.problem1.cabinet;

import assignment2.problem1.AbstractFurniture;
import assignment2.problem1.door.AbstractDoor;
import assignment2.problem1.drawer.AbstractDrawer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCabinet extends AbstractFurniture {

    private int depth;
    private int[][] shelvesAndDrawers;
    private boolean feetIncluded;
    private boolean feetRequired;
    private boolean wallMount;
    private boolean standardWallMountRail;
    private boolean wallFixtureForEarthquakeSafety;
    private List<AbstractDoor> doorList;



    protected AbstractCabinet(){}

    protected AbstractCabinet(int width, int height, int depth, String lineName, String size, boolean feetIncluded, boolean feetRequired, boolean wallMount, boolean standardWallMountRail, boolean wallFixtureForEarthquakeSafety) {
        super(width,height,lineName,size,"cabinet");
        this.depth = depth;
        this.feetIncluded = feetIncluded;
        this.feetRequired = feetRequired;
        this.wallMount = wallMount;
        this.standardWallMountRail = standardWallMountRail;
        this.doorList = new ArrayList<>();
        this.wallFixtureForEarthquakeSafety = wallFixtureForEarthquakeSafety;

    }

    public boolean isWallFixtureForEarthquakeSafety() {
        return wallFixtureForEarthquakeSafety;
    }

    public String getSize(){
        return super.getSize();
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

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean isFeetIncluded() {
        return feetIncluded;
    }

    public void setFeetIncluded(boolean feetIncluded) {
        this.feetIncluded = feetIncluded;
    }

    public boolean isWallMount() {
        return wallMount;
    }

    public void setWallMount(boolean wallMount) {
        this.wallMount = wallMount;
    }

    public int[][] getShelvesAndDrawers() {
        return shelvesAndDrawers;
    }

    public void setShelvesAndDrawers(int[][] maxShelves) {
        this.shelvesAndDrawers = maxShelves;
    }

    public String getLineName() {
        return super.getLineName();
    }

    public void setLineName(String lineName) {
        super.setLineName(lineName);
    }

    public boolean checkColors(String color) {
        return super.checkColors(color);
    }

    public void addColors(String color) {
        super.addColors(color);
    }

    public List<AbstractDoor> getDoorList() {
        return doorList;
    }

    public String getFurnitureType(){
        return super.getFurnitureType();
    }

    public boolean isStandardWallMountRail() {
        return standardWallMountRail;
    }

    public void setStandardWallMountRail(boolean standardWallMountRail) {
        this.standardWallMountRail = standardWallMountRail;
    }

    public List<String> getAdditionals() {
        return super.getAdditionals();
    }

    public void addAdditionals() {
        if(isWallFixtureForEarthquakeSafety()){
            super.addAdditionals("Wall fixture attachment for earthquake safety");
        }
        if(isStandardWallMountRail()){
            super.addAdditionals("Standard wall-mount rails");
        }
        if(getSize().equals("Quarter") && getDepth() >= 18){
            super.addAdditionals("18” drawers");
        }
    }

    public boolean hasNumOfShelvesAndDrawers(int numOfShelves, int numOfDrawers){
        for(int[] pair : this.shelvesAndDrawers){
            if(pair[0] >= numOfShelves && pair[1] >= numOfDrawers){
                return true;
            }
        }
        return false;
    }

    public boolean checkMountType(String mountType){
        mountType = mountType.toLowerCase();
        if(mountType == null || (mountType.equals("wall") && wallMount) || mountType.equals("floor") || mountType.equals("")){
            return true;
        }
        return false;
    }

    public void matchDoor(String targetColor, List<AbstractDoor> doors, List<AbstractDrawer> drawers){
        for(AbstractDoor door : doors){
            if(door.getHeight() == this.getHeight() && door.getWidth() == this.getWidth() && door.checkColors(targetColor)){
                door.matchDrawer(targetColor, drawers);
                door.addAdditionals();
                this.doorList.add(door);
            }
        }
    }

}
