package chap21;

/**
 * Created by multiangle on 2016/6/19.
 */
public class LiftOff implements Runnable {
    protected int countDown = 10; // Default
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff() {}
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "\n#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }
    public void run() {
        while(countDown-- > 0) {
            System.out.print(status());
//            if (countDown%2==0){
//                Thread.yield();
//            }
            Thread.yield();
        }
    }
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            Thread t = new Thread(new LiftOff()) ;
            t.start();
        }
    }

}