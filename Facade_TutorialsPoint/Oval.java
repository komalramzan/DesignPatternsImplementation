package Facade_TutorialsPoint;

public class Oval implements Shape {

    @Override
    public void draw(String color, int size) {
        StringBuilder sb=new StringBuilder();
      //sb.insert(size, color);
      sb.append(color);
      sb.append(size);
      System.out.println("oval drawn with color: " + color+ " size: " +size);
    }
    }