package ch04_class;

public class ShapeArea {
    public double area(int top, int bottom, int height){
    //사다리꼴의 면적: 윗변(top), 밑변(bottom), 높이(height)
        double area = (double) (top + bottom) * height / 2.0 ;
        return area ;
    }
    public double area(int width, int height){
    //사각형의 면적: 가로(width), 세로(height)
        int area = ( width * height ) ;
        return area ;
    }
    public double area(int radius) {
    //원의 면적: 반지름(r)
        final double PI = 3.14 ; // 읽기 전용이어야 하므로 final 사용
        double area = PI * ( radius * radius ) ;
        return area ;
    }
}
