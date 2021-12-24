package CompositePattern_RefactoringGuru;

import java.awt.Color;
import java.awt.*;


public class Triangle extends BaseShape {
    public int radius;
    int[] x;
    int[] y;

    public Triangle(int[] x, int[] y, Color color) {
        super(x[0], y[0], color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawPolygon(x, y, 3);
        
       
    }
}
