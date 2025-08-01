package ch04_class;

public class Car05 {
    private String brand;
    private double mileage;
    private int price;

    public Car05() {
    }

    public Car05(String brand, double mileage, int price){
        this.brand = brand ;
        this.mileage = mileage ;
        this.price = price ;
    }

    public Car05(String brand, double mileage){
        this.brand = brand ;
        this.mileage = mileage ;
    }

    public void display() {
        System.out.println("차브랜드 : " + this.brand);
        System.out.println("연비 : " + this.mileage);
        System.out.println("가격 : " + this.price);
    }
}
