public class SetTemp implements ICommand{
    AirConditioner ac;
    int lastTemp;
    SetTemp(AirConditioner ac){
        this.ac=ac;
        lastTemp=0; //default
    }
    public void execute(int temp){
        lastTemp=ac.getTemp();
        ac.changeTemp(temp);
    }
    public void undo(){
        ac.changeTemp(lastTemp);
    }
}
