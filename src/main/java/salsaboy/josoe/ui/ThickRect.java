package salsaboy.josoe.ui;

import java.awt.*;

public class ThickRect extends Component {
    private boolean isForced = true;
    private int x, y, width, height, thickness;
    public ThickRect(int x, int y, int width, int height, int thickness) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.thickness = thickness;
    }
    public void draw(Graphics g) {
        //X Y WIDTH HEIGHT
                                                                   ///////////////
        g.fillRect(x, y, thickness, height);                       //Left side  //
        g.fillRect(width, y, thickness, height);                   //Right side //
        g.fillRect(x, y, width, thickness);                        //Top side   //
        g.fillRect(height - thickness, y, width, thickness);    //Bottom side//
                                                                   ///////////////
        System.out.printf("");
    }
}
