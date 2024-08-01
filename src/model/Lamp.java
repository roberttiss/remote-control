package model;

import java.util.ArrayList;
import java.util.List;

public class Lamp extends Eletronic {

    private String color;
    private int intensity;
    public List<String> colors;
    private boolean isOn;

    public Lamp(String brand) {
        super(brand);
        colors = new ArrayList<>();
        colors.add("White");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        this.intensity = 50;
        this.color = colors.get(0);
        this.isOn = false;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean onOrOff) {
        isOn = onOrOff;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "color='" + color + '\'' +
                ", intensity=" + intensity +
                ", isOn=" + isOn +
                ", brand='" + brand + '\'' +
                '}';
    }
}
