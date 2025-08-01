package ch01_variable_operator;

public class Operator01_test {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 8 ;

        boolean bool1 = a != b ;
        boolean bool2 = --a == b++ ;

        boolean bool3 = a++ != --b ;

        boolean bool4 = bool3 && (5 > 7) ;
        boolean bool5 = !bool4 || (bool1 && bool2) ;
    }
}
