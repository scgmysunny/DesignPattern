package Design.mode.BuilderPattern;

/**
 * Created by suchen on 2017/12/28.
 * 实现 Packing 接口的实体类
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}