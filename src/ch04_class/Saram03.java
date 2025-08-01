package ch04_class;

public class Saram03 {
    private String name; //이 줄의 name : 지역변수
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    public void setName(String name) {//이 줄의 name:지역
        this.name = name; //이 줄의 뒤name :지역변수, 앞: 인스턴스변수
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //public 반환타입 메소드이름(매개변수){
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
