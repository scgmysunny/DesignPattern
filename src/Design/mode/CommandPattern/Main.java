package Design.mode.CommandPattern;

/**
 * Created by suchen on 2018/1/9.
 */
public class Main {
    public static void main(String[] args) {
        //实例化一个接收者
        Receiver receiver=new Receiver();

        //实例化一条命令，并指定接受者
        Command command=new ConcreteCommand(receiver);

        //实例化一个请求者，并拥有这条命令

        Invoker invoker=new Invoker(command);

        //请求者发起命令
        invoker.execute();
    }
}
