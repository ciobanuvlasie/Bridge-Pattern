package implementor;

import abstraction.TV;

public class BasicRemote implements Remote {

    protected TV tv;

    @Override
    public void togglePower() {
        if (tv.isOn()) tv.turnOff();
        else tv.turnOn();
    }

    @Override
    public void channelUp() {
        tv.setChannel(tv.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        tv.setChannel(tv.getChannel() - 1);
    }

    @Override
    public void volumeUp() {
        tv.setVolume(tv.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        tv.setVolume(tv.getVolume() - 1);
    }

    @Override
    public void setTV(TV tv) {
        this.tv = tv;
    }
}
