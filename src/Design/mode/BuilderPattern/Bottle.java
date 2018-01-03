package Design.mode.BuilderPattern;

/**
 * Created by suchen on 2017/12/28.
 * 创建实现Packing接口的实体类
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}