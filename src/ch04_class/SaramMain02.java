package ch04_class;

public class SaramMain02 {
    public static void main(String[] args) {
        System.out.println(Saram02.nationality);

        Saram02 yusin = new Saram02() ;
        yusin.name = "김유신" ; //yusin,soon은 참조변수, 그 뒤에 딸린 게 인스턴스변수
        yusin.height = 172.5 ;
        yusin.weight = 75.0 ;
        yusin.hobby = "당구" ;
        yusin.blood = "AB" ;

        Saram02 soon = new Saram02() ;
        soon.name = "유관순" ;
        soon.height = 165.5 ;
        soon.weight = 52.3 ;
        soon.hobby = "야구" ;
        soon.blood = "B" ;

        yusin.nationality = "한국" ;

        System.out.println(Saram02.nationality);

        System.out.println(soon.nationality);

        yusin.display(); //메소드를 호출하기
        soon.display();



    }
}
