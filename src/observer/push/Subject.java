package observer.push;

/**
 * 주제 (신문사) 인터페이스
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
