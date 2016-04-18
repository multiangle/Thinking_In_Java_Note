package chap8.practice.pro1;

/**
 * Created by multiangle on 2016/4/18.
 */
public class Cycle {

    Cycle(){
        System.out.println("create obj Cycle");
    }

    public void x (Cycle i){
        System.out.println(i.getClass());
    }
}
