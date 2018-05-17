package salsaboy.josoe;

import salsaboy.josoe.ui.OEFrame;
import javax.swing.*;
import java.awt.*;

public class JOSOE {
    public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setLayout(null);
        OEFrame frame = new OEFrame(100, 100, "") {
            @Override
            public void draw(Graphics g) {
            }
        };
        frame.paint(test.getGraphics());
        
        test.setSize(200, 200);
        test.setVisible(true);
    }
}
