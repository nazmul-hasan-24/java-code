package dsa.array;

public class LinerSearch {
    public static void main(String[] args) {
int rs = linearSearch();
        System.out.println(rs);

    }

    public static int linearSearch( ) {
        int[] ages ={22, 24,25, 33, 17, 18};
        int findout = 18;
        int age;
        for (age=0; age< ages.length; age++){
            if(ages[age] == findout){
                return age;
            }
        }
        age = -1;
        return age;
    }
}
