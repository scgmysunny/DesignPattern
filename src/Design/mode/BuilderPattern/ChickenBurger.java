package Design.mode.BuilderPattern;

/**
 * Created by suchen on 2017/12/28.
 * 创建扩展了 Burger 的实体类。
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
