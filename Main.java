package HW_4;

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
// Задание 1, способ 1, через List
        List<String> list = new ArrayList<>();
        list.add("Moscow");
        list.add("St-Pete");
        list.add("New York");
        list.add("Berlin");
        list.add("Amsterdam");
        list.add("Moscow");
        list.add("Amsterdam");
        list.add("Moscow");
        list.add("Geneva");
        list.add("Munic");
        list.add("Ushuaya");
        list.add("New Delhi");
        System.out.println("Количество элементов в массиве = " + list.size());
        list.stream().distinct().collect(Collectors.toList());
        System.out.println("Количество уникальных элементов в массиве = " + list.stream().distinct().collect(Collectors.counting()));
        System.out.println("А именно, в коллекции представлены: " + list.stream().distinct().collect(Collectors.toList()));
        System.out.println();
        System.out.println("Сколько раз встречаются слова?");
        /*for (String i: list) {
            System.out.println(i+ " : " + Collections.frequency());
        }*/


        //Задание 1, способ, способ 2, через SET
        System.out.println();
        System.out.println("Задание 1, способ, способ 2, через SET");
        Set<String> set = new HashSet<>();
        set.add("Moscow");
        set.add("St-Pete");
        set.add("New York");
        set.add("Berlin");
        set.add("Amsterdam");
        set.add("Moscow");
        set.add("Amsterdam");
        set.add("Moscow");
        set.add("Geneva");
        set.add("Munic");
        set.add("Ushuaya");
        set.add("New Delhi");
        System.out.println("Количество уникальных элементов в массиве = " + set.size());
        System.out.println();


// Задание 2

        System.out.println("Задание 2");
    PhoneDataBase phoneDataBase = new PhoneDataBase();
    phoneDataBase.add("Rudakov", 11111111111L);
    phoneDataBase.add("Rudakov", 22222222222L);
    phoneDataBase.add("Ivanov", 33333333333L);
    phoneDataBase.add("Petrov", 11111111141L);

    System.out.println("Номера телефона по фамилии Рудаков - " + phoneDataBase.get("Rudakov"));
    System.out.println("Номера телефона по фамилии Иванов - " + phoneDataBase.get("Ivanov"));

        /*System.out.println();
        for (Map.Entry<String, Long> entry: phoneMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }*/






        }

    }



