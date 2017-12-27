package Design.mode.AbstractFactoryPattern;

/**
 * Created by suchen on 2017/12/27.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
