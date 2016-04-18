package chap8.demo.pro1;

/**
 * Created by multiangle on 2016/4/18.
 */
public class Shape {
    public void draw() {
        System.out.println("Shape.draw()");
    }
    public void erase() {}
    public void type(Shape i){
        System.out.println(i.getClass());
    }
} ///:~

