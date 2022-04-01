package _done.Exam;
class Language{
    public void method(){
        System.out.println("0");
    }
}
public class Java extends Language{
    @Override
    public void method(){
        System.out.println("1");
    }

}
class Selenium extends Java {
    public void method(){
        System.out.println("2");
    }
}
class main{
    public static void main(String[] args) {
        new Java().method();
        new Language().method();
        new Selenium().method();
    }
}
