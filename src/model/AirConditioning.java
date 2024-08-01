package model;

public class AirConditioning extends Eletronic implements Device{

    private int power;
    private int temperature;

    public AirConditioning(String brand, int power) {
        super(brand);
        this.temperature = 24;
        this.power = power;
        this.isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "AirConditioning{" +
                "power=" + power +
                ", temperature=" + temperature +
                ", isOn=" + isOn +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public boolean checkIsOn() {
        return this.isOn;
    }
}
