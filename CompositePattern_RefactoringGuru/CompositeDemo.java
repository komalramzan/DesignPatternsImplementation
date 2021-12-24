package CompositePattern_RefactoringGuru;

import java.awt.*;

public class CompositeDemo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        
        int [] x = {250,300,350};
        int [] y = {100,20,100};

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                
                new CompoundShape(
                        new Triangle(x, y, Color.BLACK),
                        new Circle(290, 60, 10, Color.BLUE)
                ),
                new CompoundShape(
                    new Circle(110, 110, 50, Color.RED),
                    new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )

        );
    }
}
