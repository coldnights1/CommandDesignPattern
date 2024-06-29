public class AirConditioner {
    //Receiver
    Boolean isOn;
    int currentTemp;
    AirConditioner(){
        isOn=false;
        currentTemp=0;
    }
    public void turnOnAc(){
        isOn=true;
        System.out.println("AC is ON");
    }
    public void turnOffAc() {
        isOn = false;
        System.out.println("AC is OFF");
    }
    public void changeTemp(int temp){
        currentTemp=temp;
        System.out.println("Temperature is changed to "+currentTemp);
    }
    public int getTemp() {
        return this.currentTemp;
    }
}
