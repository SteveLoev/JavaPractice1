package task._done.Test4;
class Water{
    String color;
    public Water(String color){
        this.color = color;
    }
}
public class Pond {
    static Water water;

    public Pond(String color){
        water = new Water(color);
    }


}
