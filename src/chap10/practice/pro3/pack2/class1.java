package chap10.practice.pro3.pack2;

/**
 * Created by multiangle on 2016/5/4.
 */
import chap10.practice.pro3.pack1.interface1 ;


public class class1 {
    int value = 1 ;
    protected class interfaceClass implements interface1 {
        public int getValue(){
            return value ;
        }
    }
    public interface1 getInterfaceClass(){
        return new interfaceClass() ;
    }
}
