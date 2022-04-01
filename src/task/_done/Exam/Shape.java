package task._done.Exam;

public class Shape {
    public String name;
}

class Circle extends Shape{
    public double radius;
}
class Main{

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Shape s1 = c1;
        s1.name = "Circle";
        Circle c2 = (Circle) s1;
        c2.radius = 3.1;
        Shape s2 = c2;
        //System.out.println(s2.radius);
    }


}