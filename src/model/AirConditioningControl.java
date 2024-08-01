package model;

public class AirConditioningControl extends RemoteControl{

    private final AirConditioning airConditioning;

    public AirConditioningControl(AirConditioning airConditioning) {
        super(airConditioning);
        this.airConditioning = airConditioning;
    }

    public void increase_temperature(){
        if (airConditioning.checkIsOn()){
            int temperature = airConditioning.getTemperature();
            airConditioning.setTemperature(temperature + 1);
            System.out.println("Temperature increased to " + airConditioning.getTemperature() + "°C.");
        } else {
            System.out.println("Air Conditioning is now off");
        }
    }

    public void decrease_temperature(){
        if (airConditioning.checkIsOn()){
            int temperature = airConditioning.getTemperature();
            airConditioning.setTemperature(temperature - 1);
            System.out.println("Temperature decreased to " + airConditioning.getTemperature() + "°C.");
        } else {
            System.out.println("Air Conditioning is now off");
        }
    }

}
