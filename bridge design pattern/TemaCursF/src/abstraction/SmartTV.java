package abstraction;

public class SmartTV extends TV {

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("SmartTV is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("SmartTV is OFF");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("SmartTV channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("SmartTV volume set to " + volume);
    }
}
