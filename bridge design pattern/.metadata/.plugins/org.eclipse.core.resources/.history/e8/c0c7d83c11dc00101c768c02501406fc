package ui;

import javax.swing.*;
import java.awt.*;
import abstraction.TV;

public class TVPanel extends JPanel {

    private JLabel powerLabel = new JLabel("Power: OFF");
    private JLabel channelLabel = new JLabel("Channel: 1");
    private JLabel volumeLabel = new JLabel("Volume: 10");

    public TVPanel() {
        setLayout(new GridLayout(3,1));
        add(powerLabel);
        add(channelLabel);
        add(volumeLabel);
        setBorder(BorderFactory.createTitledBorder("TV Status"));
    }

    public void update(TV tv) {
        powerLabel.setText("Power: " + (tv.isOn() ? "ON" : "OFF"));
        channelLabel.setText("Channel: " + tv.getChannel());
        volumeLabel.setText("Volume: " + tv.getVolume());
    }
}
