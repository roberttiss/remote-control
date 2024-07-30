package model;

public class AirConditioning {

    private final String brand;
    private final int power;
    private int temperature;

    public AirConditioning(String brand, int power) {
        this.brand = brand;
        this.temperature = 24;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
