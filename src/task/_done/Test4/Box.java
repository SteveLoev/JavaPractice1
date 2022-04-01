package task._done.Test4;

public class Box {

    double width;
    double length;

    public String print(){
        return "Width: "+width+", Lenght: "+length;
    }
    public void setInfo(double width,double length){
        this.width = width;
        this.length = length;
    }
}
class useBoxes{
    public static void main(String[] args) {
        Box box = new Box();
        box.setInfo(5,11);
        System.out.println(box);
    }
}