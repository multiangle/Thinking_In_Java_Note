package chap10.practice;

/**
 * Created by multiangle on 2016/5/4.
 */
public class pro1 {
    class inner{
        private int data = 1;
        inner(int data){
            System.out.println("hehe");
            this.data = data ;
        }
    }
    public inner Inner(int d){
        return new inner(d) ;
    }
    public void test(int d){
        pro1 p = new pro1() ;
        inner x = Inner(5) ;
    }
    public static void main(String[] args){
        pro1 p = new pro1() ;
        pro1.inner x = p.Inner(5) ;
        p.test(5) ;
    }

}
