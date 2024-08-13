package exception;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class TryCatch {
    public static void main(String[] args) {
     try {
         int age = 11/0;
         System.out.println(age);
         System.out.println("Print me");

     } catch (Exception e){
         System.out.println(e);
     } finally {
         System.out.println("Program run completely");
     }

        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
// providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");

        try {
            String s = null;
            System.out.println("Array length " +s.length());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index bound Exception");
        } catch (ArithmeticException  e){
            System.out.println("ArithmeticException exception");
        } catch (NullPointerException e){
            System.out.println("Null pointer exception");
        } catch (Exception e ){
            System.out.println("Exception");
        }
    }
}
