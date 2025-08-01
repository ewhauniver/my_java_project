package ch02_control_statement;

public class DaysInMonth {
    //월 (숫자 1~12 중 하나) 입력 : 10
    // 10월의 마지막 날은 31일입니다.(printf 메소드 사용)
    // 10월의 마지막 날은 31일입니다.(println 메소드 사용)
    public static void main(String[] args) {

        int month = 10 ;
        int last_day = 0 ; // 해당 월의 마지막 날짜

        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                last_day = 31 ;
                break ;
            case 4: case 6: case 9: case 11:
                last_day = 30 ;
                break;
            case 2:
                last_day = 28 ;
                break;
            default:
                System.out.println("잘못된 월입니다.");
                System.exit(0); // 프로그램 강제 종료하기
        }
        System.out.println(month + "월의 마지막 날은 " + last_day + "일입니다.");
    }
}
