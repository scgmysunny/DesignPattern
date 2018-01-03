package Design.mode.ObserverPattern;

/**
 * Created by suchen on 2018/1/3.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}