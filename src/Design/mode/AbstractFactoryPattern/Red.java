package Design.mode.AbstractFactoryPattern;

/**
 * Created by suchen on 2017/12/27.
 * 创建实现接口的实体类。
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
