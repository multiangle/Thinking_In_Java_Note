package chap8.practice.pro3;

/**
 * Created by multiangle on 2016/4/26.
 */
public class A {
    public int field = 0 ;
    public void show(){
        System.out.println(this.getClass().getSimpleName()) ;
    }
    public void getField(){
        System.out.println("The field value is "+this.field);
    }
}
