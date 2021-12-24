package Facade_TutorialsPoint;

public class ShapeMaker {
    private Shape rectangle;
    private Shape square;
    private Shape circle;
    private Shape Oval;
    
    public ShapeMaker()
    {
            circle=new Circle();
            square=new Square();
            rectangle=new Rectangle();
            Oval=new Oval();
            
    }
    public void drawCircle()
    {
       circle.draw("white",3);
    }
    public void drawRectangle()
    {
        rectangle.draw("green",1);
    }
    public void drawSquare(){
        square.draw("red",2);
    }

    public void drawOval() {
      Oval.draw("blue",4);
    }
    
}