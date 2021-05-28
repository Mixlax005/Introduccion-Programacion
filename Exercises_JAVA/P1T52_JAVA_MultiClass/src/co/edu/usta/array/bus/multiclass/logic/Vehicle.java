package co.edu.usta.array.bus.multiclass.logic;

public class Vehicle {
    private String serviceType;
    private String color;
    private String brand;
    private String plates;
    private float width;
    private float height;
    private char[][] places;
    private int doorsNumber;
    private int wheelsNumber;

    public void setServiceType(String ServiceTypeValue) {
        serviceType = ServiceTypeValue;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setColor(String ColorValue) {
        color = ColorValue;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String BrandValue) {
        brand = BrandValue;
    }

    public String getBrand() {
        return brand;
    }

    public void setPlates(String PlatesValue) {
        plates = PlatesValue;
    }

    public String getPlates() {
        return plates;
    }

    public void setWidth(float WidthValue) {
        width = WidthValue;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float HeightValue) {
        height = HeightValue;
    }

    public float getHeight() {
        return height;
    }
    public void setPlaces(char [][] PlacesValue){
        places=PlacesValue;
    }
    public char[][] getPlaces() {
        return places;
    }
    public void setDoorsNumber(int DoorsNumberValue){
        doorsNumber=DoorsNumberValue;
    }
    public int getDoorsNumber() {
        return doorsNumber;
    }
    public void setServiceType(int WheelsNumberValue){
        wheelsNumber=WheelsNumberValue;
    }
    public int getWheelsNumber() {
        return wheelsNumber;
    }
}
