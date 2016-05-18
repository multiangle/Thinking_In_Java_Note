package chap14;

/**
 * Created by multiangle on 2016/5/17.
 */

import chap10.practice.pro1 ;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class reflection {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<? extends Object> c = pro1.class ;
        pro1 s = new pro1() ;
        Constructor[] constructor = c.getConstructors() ;
        System.out.println(c.getName());
    }
}
