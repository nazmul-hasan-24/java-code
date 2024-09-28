package oop.Polymorpism;

public class Instance {
    public static void main(String[] args) {
        Simple simple = new Simple();
        System.out.println(simple instanceof Simple);
        String a = null;
        System.out.println( a instanceof String );
        Down down = new Down();
        down.down(down);
        down.down2(down);
    }
}

class Simple{

}

class Down extends Simple{
    static void down(Simple s){
        if( s instanceof Down){
            Down d = (Down) s;
            System.out.println("Ok downcasting");
        }
    }

    void down2( Simple s){
        Down d2 = (Down) s;
        System.out.println("Down casting 2");
    }
}