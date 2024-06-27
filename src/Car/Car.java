package Car;

public class Car {
    public int speed;

    public  void speedup(){
        this.speed +=1;
    }
    public void stop(){
        this.speed=0;
    }
}

class SportCar extends Car{ // extends : 상속 (상위클래스를 하위클래스에 연장)
    // - 빠른개발 : 기존에 있던 설계도를 물려받아서 커스텀 해서 새로운 설계도/클래스 제작
   public int power;

}