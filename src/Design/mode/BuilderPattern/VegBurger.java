package Design.mode.BuilderPattern;

/**
 * Created by suchen on 2017/12/28.
 * 创建扩展了 Burger 的实体类。
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}