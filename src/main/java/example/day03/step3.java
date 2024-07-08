//package main.java.example.day03;
//
//public class step3 {
//    int x;
//    int y;
//
//    public step3(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    @Override
//    public String toString() {
//        return "step3{" +
//                "x=" + x +
//                ", y=" + y +
//                '}';
//    }
//}
//
//class Circle implements Cloneable{
//
//    step3 point;
//    int radius;
//
//     Circle(int x, int y, int radius) {
//        this.radius = radius;
//        point = new step3(x,y);
//    }
//
//    @Override
//    public String toString() {
//        return "원점은"+ point + "이고," +"반지름은"+radius+"입니다.";
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }
//    public class ObjectCloneTest{
//        public static void main(String[] args) {
//            Circle circle = new Circle(10,20,30);
//            Circle copyCircle = (Circle) circle.clone();
//
//            System.out.println(circle);
//            System.out.println(copyCircle);
//            System.out.println(System.identityHashCode(circle));
//            System.out.println(System.identityHashCode(copyCircle));
//
//        }
//    }
//
//
//}