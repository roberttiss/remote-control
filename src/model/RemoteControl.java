package model;

public abstract class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void isOn(){
        device.on();
        System.out.println(device.getClass().getSimpleName() + " is now on");
    }

    public void isOff(){
        device.off();
        System.out.println(device.getClass().getSimpleName() + " is now off");
    }

    public boolean checkDeviceOn(){
        return device.checkIsOn();
    }
}
