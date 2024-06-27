package Car;

public class step2 {
    public static void main(String[] args) {

        Car car = new Car();
        car.speedup(); //함수호출
        car.speedup();
        System.out.println("car.speed = "+ car.speed);

        SportCar sportCar = new SportCar();
        sportCar.speedup();
        System.out.println("sportCar.speed = " + sportCar.speed);
        System.out.println(" sportCar= " + sportCar.power );

        Car car2 = new Car();
        car2.speedup();
        System.out.println("car2.speed = " + car2.speed);

    }
}
