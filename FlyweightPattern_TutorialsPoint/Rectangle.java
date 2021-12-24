package FlyweightPattern_TutorialsPoint;

public class Rectangle implements Shape {
    private String color;
    private int x;
    private int y;
    private int line_thickness;
    
    public Rectangle(String color){
        this.color = color;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setLineThickness(int line_thickness) {
        this.line_thickness = line_thickness;
    }

    @Override
    public void draw() {
      System.out.println("Rectangle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", Line Thickness : " + line_thickness );
    }
}
