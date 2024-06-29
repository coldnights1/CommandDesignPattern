import java.rmi.Remote;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //i am the user
        AirConditioner ac=new AirConditioner();
        //Creating remote control
        RemoteControl remote=new RemoteControl(ac,0); //initially temperature is 0
        remote.Button3();
        remote.Button1();
        remote.undo();
    }
}