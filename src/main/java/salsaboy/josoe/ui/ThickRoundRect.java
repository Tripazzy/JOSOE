package salsaboy.josoe.ui;

import java.awt.*;

public class ThickRoundRect extends Component {
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
    
    public ThickRoundRect(int x, int y, int width, int height, int thickness) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.thickness = thickness;
    }
    public void draw(Graphics g) {
        g.setColor(borderColour);
        g.fillRoundRect(x, y, width, height, 10, 10);
        
        g.setColor(bodyColour);
        g.fillRoundRect(x + thickness, y + thickness, width - (thickness * 2), height - (thickness * 2),
            10, 10);
    }
}
