package model;

public class AirConditioningControl implements RemoteControl {

    private final AirConditioning airConditioning;

    public AirConditioningControl(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    public void increase_temperature(){
        if (checkEletronicOn()){
            int temperature = airConditioning.getTemperature();
            airConditioning.setTemperature(temperature + 1);
            System.out.println("Temperature increased to " + airConditioning.getTemperature() + "°C.");
        } else {
            System.out.println("Air Conditioning is now off");
        }
    }

    public void decrease_temperature(){
        if (checkEletronicOn()){
            int temperature = airConditioning.getTemperature();
            airConditioning.setTemperature(temperature - 1);
            System.out.println("Temperature decreased to " + airConditioning.getTemperature() + "°C.");
        } else {
            System.out.println("Air Conditioning is now off");
        }
    }

    @Override
    public void on() {
        airConditioning.setOn(true);
        System.out.println("Air Conditioning is now on");
    }

    @Override
    public void off() {
        airConditioning.setOn(false);
        System.out.println("Air Conditioning is now off");
    }

    @Override
    public boolean checkEletronicOn() {
        return airConditioning.isOn();
    }
}
