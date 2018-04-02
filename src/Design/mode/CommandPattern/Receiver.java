package Design.mode.CommandPattern;

/**
 * Created by suchen on 2018/1/9.
 * 接收者
 */
public class Receiver {
    /*
    * 接收到命令后具体的实施和执行方法
    * */
    public  void  action(){
        System.out.println("I'm Receiver,I have received the command");
    }
}
