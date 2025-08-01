package ch02_control_statement;

public class Exam4_18 {
    public static void main(String[] args) {

        int su01 = 3 ;
        int su02 = 7 ;
        int total = 0 ;

        for (int i = su01; i <= su02; i++) {
            total += i ;

        }
        System.out.println("합계 : " + total);
    }
}