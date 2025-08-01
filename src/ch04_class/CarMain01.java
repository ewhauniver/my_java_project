package ch04_class;

public class CarMain01 {
    public static void main(String[] args) {

        Car01 car1 = new Car01() ;
        Car01 car2 ;
        car2 = new Car01();

        car1.brand = "Kia" ;
        car1.model = "K9" ;
        car1.mileage = 8.1 ;
        car1.price = 5900 ;
        car1.output = 315 ;
        car1.fuel = "가솔린" ;

        System.out.println("차브랜드 : " + car1.brand);
        System.out.println("차종 : " + car1.model);
        System.out.println("연비 : " + car1.mileage);
        System.out.println("가격(원) : " + String.format("%,d", car1.price));
        System.out.println("출력 : " + car1.output);
        System.out.println("연료 종류 : " + car1.fuel);

        car2.brand = "Benz" ;
        car2.model = "Eclass";
        car2.mileage = 10.5 ;
        car2.price = 6900 ;
        car2.output = 197 ;
        car2.fuel = "가솔린, 디젤" ;

        System.out.println("");
        System.out.println("차브랜드 : " + car2.brand);
        System.out.println("차종 : " + car2.model);
        System.out.println("연비 : " + car2.mileage);
        System.out.println("가격(원) : " + String.format("%,d", car2.price));
        System.out.println("출력 : " + car2.output);
        System.out.println("연료 종류 : " + car2.fuel);

        System.out.println("");
        String message = car1.showOutputInfo();
        System.out.println(message);
        message = car2.showOutputInfo();
        System.out.println(message);
    }
}
