package projects;
import java.util.Scanner;
public class Auth {
    public static void main(String[] args) {
        System.out.println("Welcome Food App");
        System.out.println("Create a password");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();
        System.out.println("Your password is " +pass1);
        System.out.println("Enter your password");
        String pass = scan.next();
        while (!pass1.equals(pass)){
            System.out.println("Wrong password! Try again " + pass);
            pass = scan.next();
        }
        System.out.println("Access grunted");
        System.out.println("Are your hungry? yes or no");
        String ans1 = scan.next();
        if(ans1.equals("yes") || ans1.equals("Yes") || ans1.equals("YES")){
            System.out.println("What foods do you want? Fizza Burger or Fish");
            String ans2 = scan.next();
            while ( ans2.equals("Fizza") && ans2.equals("Fish")){
                System.out.println("Sorry we do not have it, chose between Fizza and Fish");
                ans2 = scan.next();
            }

                System.out.println("Do you want to drink? Yes or No");
                String ans3 = scan.next();
                while (ans3.equals("yes") || ans3.equals("no")){
                    System.out.println("Wrong commend");
                    ans3 = scan.next();

            }
        } else {
            System.out.println("All right, have a good day"); 
        }

    }
}
