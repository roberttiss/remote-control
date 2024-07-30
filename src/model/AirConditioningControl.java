package model;

public class AirConditioningControl implements Eletronic {

    private AirConditioning airConditioning;

    public void increase_temperature(){
        int temperature = airConditioning.getTemperature();
        airConditioning.setTemperature(temperature + 1);
        System.out.println("Temperature increased to " + airConditioning.getTemperature() + "°C.");
    }

    public void decrease_temperature(){
        int temperature = airConditioning.getTemperature();
        airConditioning.setTemperature(temperature - 1);
        System.out.println("Temperature decreased to " + airConditioning.getTemperature() + "°C.");
    }

    @Override
    public void on() {
        System.out.println("Air Conditioning is now on");
    }

    @Override
    public void off() {
        System.out.println("Air Conditioning is now off");
    }
}
