package chap8.practice.pro4;

/**
 * Created by multiangle on 2016/4/26.
 */
public class A {
    public void test(){
        System.out.println("test from A");
    }
    A(){
        test();
    }
}
