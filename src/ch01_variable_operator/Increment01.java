package ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {

        int x = 3; // 할당

        x *= 4 ; // x = x * 4 ; 누적 할당,  =는 복합대입연산자
        System.out.println("x : " + x);

        x %= 5 ;
        System.out.println("x : " + x);

        x -= 1 ;
        System.out.println("x : " + x);

        x += 7 ;
        System.out.println("x : " + x);
    }
}
