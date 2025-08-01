package ch04_class;

public class CarMain05 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Car05[] car = new Car05[2] ; // 배열정의, 기아

        car[0] = new Car05("기아", 8.1, 5900);

        car[1] = new Car05("벤츠", 10.5);

        for (int i = 0; i < car.length; i++) {
            car[i].display();
        }
    }
}
