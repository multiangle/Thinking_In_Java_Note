package chap8.practice.pro4;

/**
 * Created by multiangle on 2016/4/26.
 */
public class B extends A {
    private int value = 1 ;
    B(){
        test();
        this.value = 5 ;
        test();
    }
    public void test(){
        System.out.println("test from B, value = "+this.value);
    }
    public static void main(String[] args){
        B b = new B() ;
    }
}
