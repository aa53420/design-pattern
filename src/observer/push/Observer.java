package observer.push;

/**
 * 옵저버(구독자)
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
