package cpa_calculator;
import java.util.Scanner;
public class GpaCalculator {
    public static void main(String[] args){
        System.out.println("How many subjects do you have?");
        Scanner scan = new Scanner(System.in);
        int sub = scan.nextInt();
        double[] subjects = new double[sub];
        double totalRes = 0;
try {
    for (int i =0; i < subjects.length; i++){
        System.out.println("Number of subject " + (i + 1) + ":");
        subjects[i] = scan.nextDouble();
        if(subjects[i] <= 33){
            System.out.println("You are failed");

        }
    }
} catch (Exception e){
    System.out.println(e);
}

        for (double subject : subjects) {
            totalRes = totalRes + subject;

        }
        System.out.println("Your total number is: " +totalRes);
        double ava = totalRes / subjects.length;
        System.out.println("Average number is: " +ava);
            if(ava >= 80){
                System.out.println(" A+ " +ava);
            }else if (ava >=70 && ava <= 79) {
                System.out.println("Your grade A " +ava);
            }else if (ava >=60 && ava <=69) {
                System.out.println("Your grade A- " +ava);
            }else if (ava >= 50 && ava <= 59) {
                System.out.println("Your grade B " +ava);
            }else if (ava >=40 && ava <= 49) {
                System.out.println("Your grade C " +ava);
            }else if(ava >= 33 & ava <=39){
                System.out.println("Your grade D " +ava);
            }else {
                System.out.println("You are failed " +ava);
            }
        }

    }

