package ch02_control_statement;

import java.util.Scanner; // 스캐너 장치 만들때 임포트

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //스캐너 장치

        int total = 0 ;
        int count = 0 ;
        double average = 0.0 ;

        while (true){ // while 무한루프
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt(); // 스캐너 읽음


            if(grade < -10){ //숫자가 -10 미만인 경우에 대한 처리
                System.out.println("");
                System.out.println("프로그램을 종료합니다.");
                break; //빠져 나갈 구멍 만들음
            }else if(grade < 0){ //-10 이상의 음수에 대한 처리
                grade=-grade; //-5면 5가 되는 절대값에 대한 처리
            }else{

            }

            total+=grade; //총점에 추가
            count++; //시험빈도 카운트
    }
        System.out.println("총 시험 빈도(횟수) : " + count);
        System.out.println("총점 : " + total);
        average = (double) total / count ;
        System.out.println("평균 : " + average);
    }
}