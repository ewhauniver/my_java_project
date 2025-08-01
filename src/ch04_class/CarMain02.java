package ch04_class;

public class CarMain02 {
    public static void main(String[] args) {

        Car02 car1 = new Car02() ;
        Car02 car2 = new Car02();

        car1.setBrand("Kia") ;
        car1.setModel("K9") ;
        car1.setMileage(8.1) ;
        car1.setPrice(5900) ;
        car1.setOutput(197) ;
        car1.setFuel("가솔린") ;

        car2.setBrand("Benz") ;
        car2.setModel("Eclass") ;
        car2.setMileage(10.5) ;
        car2.setPrice(6900) ;
        car2.setOutput(315) ;
        car2.setFuel("가솔린, 디젤") ;

        System.out.println("차브랜드 : " + car1.getBrand());
        System.out.println("차종 : " + car1.getModel());
        System.out.println("연비 : " + car1.getMileage());
        System.out.println("가격(원) : " + String.format("%,d", car1.getPrice()));
        System.out.println("출력 : " + car1.getOutput());
        System.out.println("연료 종류 : " + car1.getFuel());

        System.out.println("");
        System.out.println("차브랜드 : " + car2.getBrand());
        System.out.println("차종 : " + car2.getModel());
        System.out.println("연비 : " + car2.getMileage());
        System.out.println("가격(원) : " + String.format("%,d", car2.getPrice()));
        System.out.println("출력 : " + car2.getOutput());
        System.out.println("연료 종류 : " + car2.getFuel());
    }
}
