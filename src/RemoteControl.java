import java.util.*;

public class RemoteControl {
    //basically invoker
    Stack<ICommand>stack;
    ICommand command1,command2,command3;
    int cTemp;
    RemoteControl(AirConditioner ac,int cTemp){
        stack=new Stack<>();
        this.cTemp=cTemp;
        this.command1=new TurnOnCommand(ac);
        this.command2=new TurnOffCommand(ac);
        this.command3=new SetTemp(ac);
    }
    public void Button1(){
        command1.execute(this.cTemp);
        stack.add(command1);
    }
    public void Button2(){
        command2.execute(this.cTemp);
        stack.add(command2);
    }
    public void Button3(){
        command3.execute(this.cTemp);
        stack.add(command3);
    }
    public void undo(){
        ICommand lastcommand=stack.pop();
        lastcommand.undo();
    }

}
