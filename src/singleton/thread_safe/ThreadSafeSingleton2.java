package singleton.thread_safe;

public class ThreadSafeSingleton2 {
    private static ThreadSafeSingleton2 instance = new ThreadSafeSingleton2();

    private ThreadSafeSingleton2() {}

    public static ThreadSafeSingleton2 getInstance(){
        return instance;
    }
}
