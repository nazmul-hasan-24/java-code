package carpicker;
import java.util.Scanner;
public class Car {
    public  static void main(String[] arg){
        System.out.println("Do you want to buy car?");
        Scanner scan = new Scanner(System.in);
        String ans1 = scan.next();
        if(ans1.equals("yes") || ans1.equals("Yes") || ans1.equals("YES")){
            System.out.println("What color do you want?\n red, blue, yellow");
            String ans2 = scan.next();
            if(ans2.equals("Red") || ans2.equals("red")){
                System.out.println("See details and order now, Thank you");
            } else if(ans2.equals("blue") || ans2.equals("Blue")){
                System.out.println("This colour not available");
            }
        } else{
            System.out.println("Programme exit");
        }
    }
}
