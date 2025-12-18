package ui;

import javax.swing.*;
import abstraction.*;
import implementor.*;

import java.awt.*;

public class MainFrame extends JFrame {

    private TVPanel tvPanel = new TVPanel();
    private TV currentTV;
    private Remote currentRemote;

    public MainFrame() {
        setTitle("TV Bridge Simulator");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ComboBox TV
        JComboBox<String> tvBox = new JComboBox<>(new String[]{"OldTV", "SmartTV"});
        JComboBox<String> remoteBox = new JComboBox<>(new String[]{"BasicRemote", "AdvancedRemote"});

        JButton powerBtn = new JButton("Power");
        JButton chUp = new JButton("Channel +");
        JButton chDown = new JButton("Channel -");
        JButton volUp = new JButton("Volume +");
        JButton volDown = new JButton("Volume -");
        JButton muteBtn = new JButton("Mute");

        JPanel controls = new JPanel();
        controls.add(new JLabel("TV:"));
        controls.add(tvBox);
        controls.add(new JLabel("Remote:"));
        controls.add(remoteBox);
        controls.add(powerBtn);
        controls.add(chUp);
        controls.add(chDown);
        controls.add(volUp);
        controls.add(volDown);
        controls.add(muteBtn);

        add(tvPanel, BorderLayout.CENTER);
        add(controls, BorderLayout.SOUTH);

        // Initialize TV and Remote
        tvBox.addActionListener(e -> {
            String tvType = tvBox.getSelectedItem().toString();
            if (tvType.equals("SmartTV")) currentTV = new SmartTV();
            else currentTV = new OldTV();
            if (currentRemote != null) currentRemote.setTV(currentTV);
            tvPanel.update(currentTV);
        });

        remoteBox.addActionListener(e -> {
            String rType = remoteBox.getSelectedItem().toString();
            if (rType.equals("AdvancedRemote")) currentRemote = new AdvancedRemote();
            else currentRemote = new BasicRemote();
            if (currentTV != null) currentRemote.setTV(currentTV);
        });

        // Button actions
        powerBtn.addActionListener(e -> { if(currentRemote != null) { currentRemote.togglePower(); tvPanel.update(currentTV); }});
        chUp.addActionListener(e -> { if(currentRemote != null) { currentRemote.channelUp(); tvPanel.update(currentTV); }});
        chDown.addActionListener(e -> { if(currentRemote != null) { currentRemote.channelDown(); tvPanel.update(currentTV); }});
        volUp.addActionListener(e -> { if(currentRemote != null) { currentRemote.volumeUp(); tvPanel.update(currentTV); }});
        volDown.addActionListener(e -> { if(currentRemote != null) { currentRemote.volumeDown(); tvPanel.update(currentTV); }});
        muteBtn.addActionListener(e -> { if(currentRemote instanceof AdvancedRemote) { ((AdvancedRemote)currentRemote).mute(); tvPanel.update(currentTV); }});
    }
}
