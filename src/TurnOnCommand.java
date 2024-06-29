public class TurnOnCommand implements ICommand{
    AirConditioner ac;
    TurnOnCommand(AirConditioner ac){
        this.ac=ac;
    }
    public void execute(int temp){
        ac.turnOnAc();
    }
    public void undo(){
        ac.turnOffAc();
    }
}
