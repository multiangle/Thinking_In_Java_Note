package chap15;

/**
 * Created by multiangle on 2016/5/23.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
