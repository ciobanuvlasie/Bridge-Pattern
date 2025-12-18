package implementor;

import abstraction.TV;

public class AdvancedRemote extends BasicRemote {

    public void mute() {
        tv.setVolume(0);
        System.out.println("TV muted");
    }
}
