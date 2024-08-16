package dsa.array;

public class Array {
    public static void main(String[] args) {
      Arr.basicArray();
    }
}
class Arr{
    public static void basicArray(){
        //1. Fixed Sized Arrays also its is one dimensional array
        int[] rolls = new int[5];
        rolls[0] = 2;
        rolls[1] =3;
        rolls[2] =4;
        rolls[3] =5;
        rolls[4] =6;
        System.out.println(rolls[1]);

        for(int roll: rolls){
            System.out.println("All roll printing: " +roll);

        }
        //another way dsa.array init
        int[] arr ={11,21,3,45,6};
        int a1 = arr[4]; // its print arr of 4 no index
        System.out.println(a1);
        for(int i =0; i < arr.length; i++){
            // print arr
            System.out.println("Index: " +i + " Element: " +arr[i]);
        }
    }
    public static void twoDimensionalArr(){
        //. Two-dimensional (2D) array:
        //Multidimensional arrays can be considered as an array of arrays or as a matrix consisting of rows and columns.

        //Syntax for Declaration of Two-Dimensional Array

        //data_type array_name[sizeof_1st_dimension][sizeof_2nd_dimension];
        int[][] myArray = new int[3][4];
        //3 rows
        //4 columns in each row


    }
}