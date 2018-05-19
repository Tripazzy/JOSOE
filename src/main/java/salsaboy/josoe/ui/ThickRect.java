package salsaboy.josoe.ui;

import java.awt.*;

public class ThickRect extends Component {
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
        for (int i = 0; i < thickness; i++) {
            g.drawRect(x + i, y + i, width - (i * 2), height - (i * 2));
        }
    }
}
