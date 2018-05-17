package salsaboy.josoe.ui;

import com.sun.istack.internal.Nullable;
import salsaboy.josoe.Variables;
import javax.swing.*;
import java.awt.*;

public abstract class OEFrame extends JPanel {
    public JPanel topBar = new JPanel();
    public boolean isMinimizable = Minimizable.class.isAssignableFrom(this.getClass());
    
    public abstract void draw(Graphics g);
    @Override
    public void paint(Graphics g) {
        
        g.fillRect(getX(), getY(), getWidth(), 30); //FIXME Why does this throw a NullPointerException
        
        draw(g);
    }
    public OEFrame(int width, int height, @Nullable String title) {
        try {
            int inward = Variables.oeFrames.size() * 30;    //For that cascading look, similar to the one on Windows
            setBounds(width, height, inward, inward);
        } catch (NullPointerException e) {
            if (!title.equals(null)) {
                e.printStackTrace();
            } else {
                System.out.println("STRING DON'T EXIST");
            }
        }
    }
}
