package exception;
import java.io.*;

public class Throw {

    public static  String method(String fileName) throws FileNotFoundException  {
        File file = new File(fileName);
        throw new FileNotFoundException();

    }
    public static void main(String[] args) {

      try{
          String file1 = "F:\\All Soft.abt.txt";
    String ot= method(file1);
          System.out.println(ot);
      } catch (FileNotFoundException e){
          System.out.println(e);
      }
//        int age = 13;
//        if (age >= 18){
//            throw new ArithmeticException("Your are not");
//        } else {
//            System.out.println("Not eligible");
//        }

    }
}
