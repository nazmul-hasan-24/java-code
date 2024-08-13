package sri;
import java.io.*;
public class Seri {
    public static void main(String[] args) {
       try {
           Sutdent sutdent = new Sutdent("Hasan", 22);
           FileOutputStream fos = new FileOutputStream("f.txt");
           ObjectOutputStream ob = new ObjectOutputStream(fos);
           ob.flush();
           ob.close();
           System.out.println("Done");

       } catch (Exception e){
           System.out.println(e);
       }



    }
}

