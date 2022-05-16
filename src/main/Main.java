package main;

import box.Box;
import test.Man;
import test.MyMath;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Иван", 27);
        System.out.println(man.getAge());

        Box box = new Box();

        int sqare = MyMath.square(20);
        System.out.println("Sqare = " + sqare);

        double lenth = MyMath.lenth (10);
        System.out.println(lenth);

        double area = MyMath.area(10);
        System.out.println(area);

        lenth = MyMath.lenth (10);
        System.out.println(lenth);

        int sum = MyMath.sum(5, 6, 7);
        System.out.println(sum);
    }
}
