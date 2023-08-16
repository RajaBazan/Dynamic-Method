package hello.com;
class Phone{
    public void On(){
        System.out.println("Turning on the phone ....");
    }
    public void ShowTime(){
        System.out.println("Time is now 12:21 pm");
    }
}
class SmartPhone extends Phone{

    public void Music(){
        System.out.println("Play Music");
    }
    @Override
    public void On(){
        System.out.println("Turning on the smart phone ....");
    }
}
public class Lec_49_Dynamic_method_Dispach {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
//        obj.name();
//        SmartPhone obj1 = new SmartPhone();
//        obj1.hey();
//        obj1.name();
        obj.ShowTime();
        obj.On();

    }
}
