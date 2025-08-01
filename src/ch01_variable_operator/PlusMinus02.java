package ch01_variable_operator;

public class PlusMinus02 {
    public static void main(String[] args) {

        int x = 3, y = 5, z ;

        z = x++ + --y ; // 3 4 2 1

        System.out.println("x : " + x); // 4
        System.out.println("y : " + y); // 4
        System.out.println("z : " +z ); // 7

        z += --x + y++ ;
        // z = z + --x + y++ ;
        //   4   2  1  3  5

        System.out.println("x : " + x); // x = 4 - 1 = 3
        System.out.println("y : " + y); // y = 4 + 1 = 5
        System.out.println("z : " + z); // z = 7 + 3 + 4 = 14

    }
}
