package ch02_control_statement;

public class SelfIF01 {
    public static void main(String[] args) {
        String name = "유재석" ; // 이름
        int score = 97 ; // 시험 점수

        String pass ; // 합격 여부 문자열
        String superiority ; // 우수성

        if(score >= 80){
            pass = "합격" ;
        }else{
            pass = "불합격" ;
        }
        if(score >= 90 && score < 94 ){
            superiority = "우수" ;
        }else{
            superiority = "최우수" ;
        }

        String message ;
        message = name + "은(는) 시험에 " + pass + "입니다." + "그리고 성적은 " + superiority + "입니다." ;
        System.out.println(message);
    }
}
