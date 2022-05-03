package singleton.thread_safe;

public class ThreadSafeSingleton3 {
    private volatile static ThreadSafeSingleton3 instance;

    private ThreadSafeSingleton3() {}

    public static ThreadSafeSingleton3 getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton3.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton3();
                }
            }
        }

        return instance;
    }
}
