package chap12.demo;

/**
 * Created by multiangle on 2016/5/12.
 */
import java.util.logging.*;
import java.io.*;

class LoggingException extends Exception {
    private static Logger logger =
            // 创建一个String参数相关联的Logger对象
            Logger.getLogger("LoggingException");
    public LoggingException() { //构造函数
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        // 调用server向Logger写入
        logger.severe(trace.toString()); // trace可以追踪 到出错点
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();  // 需要新建一个 exception变量
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}