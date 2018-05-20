package salsaboy.josoe.ui;

import java.awt.*;

public class ThickRect extends Component {
    protected int x, y, width, height, thickness;
    private Color borderColour = Color.BLACK;
    public void setBorderColour(Color colour) {
        borderColour = colour;
        repaint();
    }
    private Color bodyColour = Color.WHITE;
    public void setBodyColour(Color colour) {
        bodyColour = colour;
        repaint();
    }
    
    public ThickRect(int x, int y, int width, int height, int thickness) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.thickness = thickness;
    }
    public void draw(Graphics g) {
        for (int i = 0; i <= thickness; i++) {
            if (i == thickness) {
                g.setColor(bodyColour);
                g.fillRect(x + i, y + i, width - (i * 2), height - (i * 2));
            } else {
                g.setColor(borderColour);
                g.drawRect(x + i, y + i, (width - (i * 2)) - 1, (height - (i * 2)) - 1);
            }
        }
    }
}
