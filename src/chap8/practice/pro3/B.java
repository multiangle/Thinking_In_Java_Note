package chap8.practice.pro3;

import java.util.Objects;

/**
 * Created by multiangle on 2016/4/26.
 */
public class B extends A{
    public int field = 1 ;
    public void show(){
        System.out.println(this.getClass().getSimpleName()) ;
    }
    public static void test(A item){
        item.show() ;
    }
    public void getField(){
        System.out.println("The field value is "+this.field);
    }
    public static void main(String[] args){
        A a = new A() ;
        A b = new B() ;
        System.out.println("=====a======");
        System.out.println("this.field "+a.field);
        a.getField();
        System.out.println("=====b======");
        System.out.println("this.field "+b.field);
        b.getField();
    }
}
