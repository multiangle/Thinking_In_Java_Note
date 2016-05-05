package chap10.practice.pro3.pack3;

/**
 * Created by multiangle on 2016/5/4.
 */
import chap10.practice.pro3.pack2.class1 ;
import chap10.practice.pro3.pack1.interface1 ;

public class class2 extends class1{
    public interface1 getClass1(){
        class1 c1 = new class1() ;
        return c1.getInterfaceClass() ;
    }
    public static void main(String[] args){
        class2 c2 = new class2() ;
        interface1 i = c2.getClass1() ;
        System.out.println(i.getValue());
    }
}
