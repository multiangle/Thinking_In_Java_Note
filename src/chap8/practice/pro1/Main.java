package chap8.practice.pro1;

/**
 * Created by multiangle on 2016/4/18.
 */
public class Main {
    public static void main(String[] args){
        Unicycle uc = new Unicycle() ;
        ride(uc);
        uc.x(uc);
    }

    public static void ride(Cycle i){
        System.out.println(i.getClass());
    }
}
