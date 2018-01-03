package Design.mode.BuilderPattern;

/**
 * Created by suchen on 2017/12/28.
 * 创建扩展了 ColdDrink 的实体类。
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}