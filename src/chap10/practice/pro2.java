package chap10.practice;

/**
 * Created by multiangle on 2016/5/4.
 */
public class pro2 {
    private int data ;
    pro2(int data){
        this.data = data ;
    }
    class Inner{
        int data2 ;
        Inner(int d){
            data = d ;
        }
        public int ret_data(){
            return data ;
        }
    }
    public Inner getInner(int data){
        return new Inner(data) ;
    }
    public static void main(String[] args){
        pro2 p = new pro2(5) ;
        pro2.Inner in = new pro2(5).new Inner(6) ;
        System.out.println(in.ret_data());
        System.out.println(p.data);
    }
}
