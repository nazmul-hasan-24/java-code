package oop.Polymorpism;

public class Bank {
    public static void main(String[] args) {
        IslamiBank is = new IslamiBank();
        is.rateOfInterest(2);
        SonaliBank sonaliBank = new SonaliBank();
        sonaliBank.rateOfInterest(8);
    }
    
}

class BangladeshBank{
    int rateOfInterest( int interest){
        return 0;
    }


}

class IslamiBank extends BangladeshBank{
    @Override
    int rateOfInterest(int interest) {
        System.out.println("Islami Bank " +interest);
        return interest;
    }
}

class SonaliBank extends BangladeshBank{
    @Override
    int rateOfInterest(int interest) {
        System.out.println("Sonali Bank " +interest);
        return interest;
    }
}