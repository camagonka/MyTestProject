package main.java;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("world");
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));
    }

    private static void hello(String somebody) {
        System.out.println("Hello " + somebody);
    }

    private static double area(Square s){
        return s.l+s.l;
    }
}
