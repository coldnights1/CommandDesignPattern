public class TurnOffCommand implements ICommand{
    AirConditioner ac;
    TurnOffCommand(AirConditioner ac){
        this.ac=ac;
    }
    public void execute(int temo){
        ac.turnOffAc();
    }
    public void undo(){
        ac.turnOnAc();
    }
}
