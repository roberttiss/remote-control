package model;

public class AirConditioning extends Eletronic{

    private int power;
    private int temperature;
    private boolean isOn;

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

    public void setOn(boolean onOrOff) {
        isOn = onOrOff;
    }

    public boolean isOn() {
        return isOn;
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
}
