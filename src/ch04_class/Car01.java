package ch04_class;

public class Car01 {
    //       자료형 =
    String brand ;
    String model ;
    double mileage ;
    int price ;
    int output ;
    String fuel ;

    String showOutputInfo() {
        String grade = "" ;

        if(output >= 500) {
            grade = "고사양" ;
        }else if(output >= 300){
            grade = "중사양" ;
        }else if(output >= 100){
            grade = "저사양" ;
        }else{
            grade = "규격 외" ;
        }

        String message = brand + "의 " + model + " 출력 등급은 " + grade + "입니다.";
        return message ;

        }
    }

