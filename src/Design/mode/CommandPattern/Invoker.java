package Design.mode.CommandPattern;

/**
 * Created by suchen on 2018/1/9.
 * 请求者
 */
public class Invoker {
    /*
    * 请求者拥有一个命令实例，可以发起命令
    * */
    private Command fCommad;
    /*
    * 实例化请求者的同时，实例化一个命令对象
    * */
    public  Invoker(Command cmd){
        fCommad=cmd;
    }
    /*
    * 发起命令
    * */
    public void execute(){
        System.out.println("I'm Invoker,I invoke the command");
        fCommad.execute();
    }
}
