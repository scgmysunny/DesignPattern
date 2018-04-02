package Design.mode.CommandPattern;

/**
 * Created by suchen on 2018/1/9.
 * 具体的命令
 */
public class ConcreteCommand implements Command {

    /* *
    该命令的接受者
    */
    private final Receiver fReceiver;

    /**
     * 实例化命令时，需要为命令指定一个接收者
     */
    public ConcreteCommand(Receiver fReceiver) {
        this.fReceiver = fReceiver;
    }

    /*
    * 命令的实现方式由命令的接收者决定
    * */
    @Override
    public void execute() {
        System.out.println("Send the command to the receiver");
    }
}
