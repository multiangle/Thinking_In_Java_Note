package chap8.demo.pro1;

/**
 * Created by multiangle on 2016/4/18.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator() ;
    public static void main(String[] args){
        Shape[] s = new Shape[9] ;
        for(int i = 0;i<s.length;i++) s[i] = gen.next() ;
        for (Shape shp : s) shp.draw();
    }
}
