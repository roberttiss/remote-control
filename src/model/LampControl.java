package model;

import java.util.Optional;

public class LampControl implements RemoteControl{

    private final Lamp lamp;

    public LampControl(Lamp lamp) {
        this.lamp = lamp;
    }

    public void changeColor(){
        if (checkEletronicOn()){
            String currentColor = lamp.getColor();
            Optional<String> nextColor = lamp.colors.stream()
                .dropWhile(color -> !color.equals(currentColor))
                .skip(1)
                .findFirst();
            if (nextColor.isPresent()){
                lamp.setColor(nextColor.get());
                System.out.println("Color of lamp defined as " + nextColor.get());
            }
            else {
                lamp.setColor(lamp.colors.get(0));
                System.out.println("Color of lamp defined as White");
            }
        } else {
            System.out.println("Lamp is now off");
        }
    }

    public void changeIntensity(int intensity){
        if (checkEletronicOn() && verifyValue(intensity)){
            lamp.setIntensity(intensity);
            System.out.println("Intensity of lamp defined as " + intensity + ".");
        } else {
            System.out.println("Choose intensity between 0 and 100 or check that the lamp is on");
        }
    }

    public boolean verifyValue(int value){
        return value >= 0 && value <= 100;
    }

    @Override
    public void on() {
        System.out.println("Lamp is now on");
        lamp.setOn(true);
    }

    @Override
    public void off() {
        System.out.println("Lamp is now off");
        lamp.setOn(false);
    }

    @Override
    public boolean checkEletronicOn() {
        return lamp.isOn();
    }
}
