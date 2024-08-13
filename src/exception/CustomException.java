package exception;


class  UserDefinedException extends  Exception{

    public UserDefinedException(String mes){
        super(mes);
//        System.out.println(mes);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
//            int a = 3 /0;
          throw new   UserDefinedException("You cant divided 3 by 0");
        } catch (UserDefinedException ude){
            System.out.println("C e");
            System.out.println(ude.getMessage());
        }

    }
}

