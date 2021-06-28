package HW_3;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Fruit apple = new Fruit("Яблоко", 1.0f);
        Fruit orange = new Fruit("Апельсин",1.5f);

        Box appleBox = new Box(apple, 27);
        Box orangeBox = new Box(orange, 25);
        Box applebox2 = new Box(apple, 0);


        System.out.println("Задание 1.");
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        swapElement(arr, 1, 2);
        System.out.println(Arrays.toString(arr));


        System.out.println("Задание 2.");
        System.out.println("---------------------------------");
        System.out.println("Коробка с яблоками весит = " + appleBox.getFruitWeight());
        System.out.println("Коробка с апельсинами весит = " + orangeBox.getFruitWeight());
        System.out.println("---------------------------------");
        System.out.println("Сравнение: " + appleBox.compare(applebox2));
        System.out.println("---------------------------------");
        appleBox.pourFruits(applebox2, 3);
        System.out.println("---------------------------------");
        appleBox.putFruits(10);
        System.out.println("----------конец дз----------");








    }

    static void swapElement(Integer[] arr, int i, int i1) {
        int a = arr[i];
        arr[i] = arr [i1];
        arr[i1] = a;

    }
}