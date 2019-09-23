package assignment2.problem1;


import java.util.HashSet;
import java.util.Set;

public abstract class AbstractFurniture {
    private String furnitureType;
    private int width;
    private int height;
    private int price;
    private String lineName;
    private String size;
    private Set<String> colors;

    protected AbstractFurniture(){}

    protected AbstractFurniture(int width, int height, String lineName, String size, String furnitureType) {
        this.width = width;
        this.height = height;
        this.lineName = lineName;
        this.size = size;
        colors = new HashSet<>();
        this.furnitureType = furnitureType;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColors(Set<String> colors) {
        this.colors = colors;
    }

    public boolean checkColors(String color) {
        return colors.contains(color);
    }

    public void addColors(String color) {
        this.colors.add(color);
    }
}
