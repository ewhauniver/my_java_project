package ch04_class;

public class ShapeAreaMain {
    public static void main(String[] args){
        ShapeArea obj = new ShapeArea() ;

        int radius = 10 ; // 원
        int width = 5, heigth = 10 ; // 사각형
        int top = 5, bottom = 15, trapHeight = 10 ; // 사다리꼴

        // 메소드 오버로딩 호출
        obj.area(radius) ; // 원
        obj.area(width, heigth) ; // 사각형
        obj.area(top, bottom, trapHeight) ; // 사다리꼴

        // 값 변환 후 출력
        double circleArea = obj.area(radius) ;
        System.out.println("원의 면적 : " + circleArea) ;

        double rectArea = obj.area(width, heigth) ;
        System.out.println("사각형의 면적 : " + rectArea) ;

        double trapArea = obj.area(top, bottom, trapHeight) ;
        System.out.println("사다리꼴의 면적 : " + trapArea) ;
    }
}
