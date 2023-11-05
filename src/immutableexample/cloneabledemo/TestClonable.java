package immutableexample.cloneabledemo;

import java.util.Arrays;

public class TestClonable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep();
        sheep1.cost = 10;
        sheep1.iArray[0] = 1;
        Sheep sheep2 = (Sheep) sheep1.clone();

        System.out.println("Sheep One " + sheep1.cost + " " + sheep1.iArray[0]+" "+sheep1.iArray[1]);
        System.out.println("Sheep Two " + sheep2.cost + " " + sheep2.iArray[0]+" "+sheep2.iArray[1]);
        sheep2.cost=555;
        System.out.println("*************");
        sheep2.cost=999;
        System.out.println("Sheep One " + sheep1.cost + " " + sheep1.iArray[0]+" "+sheep1.iArray[1]);
        System.out.println("Sheep Two " + sheep2.cost + " " + sheep2.iArray[0]+" "+sheep2.iArray[1]);
    }
}
