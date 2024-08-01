package model;

public abstract class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.on();
        System.out.println(device.getClass().getSimpleName() + " is now on");
    }

    public void turnOff(){
        device.off();
        System.out.println(device.getClass().getSimpleName() + " is now off");
    }

}
