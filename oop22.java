interface TVremote{
    void TurnOn();
    void TurnOff();
}

interface SmartTvRemote extends TVremote{
    void DisplayOn();
    void DisplayOff();

}

class TV implements TVremote{
    public void TurnOn(){
        System.out.println("Turn On ~");
    }

    public void TurnOff(){
        System.out.println("Turn Off ~");
    }

}

public class oop22 {
    public static void main(String[] args) {
        TV tv= new TV();
        tv.TurnOff();
        tv.TurnOn();
        
    }
    
}
