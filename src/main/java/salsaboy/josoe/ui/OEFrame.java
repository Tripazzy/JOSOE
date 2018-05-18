package salsaboy.josoe.ui;

import com.sun.istack.internal.Nullable;
import salsaboy.josoe.Variables;
import javax.swing.*;
import java.awt.*;

public abstract class OEFrame extends JPanel {
    public JPanel topBar = new JPanel();
    public boolean isMinimizable = Minimizable.class.isAssignableFrom(this.getClass()); //This should still work on sub-classes
    
    public abstract void draw(Graphics g);
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        System.out.println("Drawing");
        g.fillRect(getX(), getY(), getWidth(), 30);
        
        draw(g);
    }
    public OEFrame(int width, int height, @Nullable String title) {
        try {
            int inward = Variables.oeFrames.size() * 30;    //For that cascading look, similar to the one on Windows
            setBounds(inward, inward, width, height);
            
            Variables.oeFrames.add(this);
        } catch (NullPointerException e) {
            if (!title.equals(null)) {
                e.printStackTrace();
            } else {
                System.out.println("The window has no name.\nIgnoring.");
            }
        }
    }
}
