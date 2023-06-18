//Пусть дан произвольный список из 100 целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(100));
        }

        for (int i = list.size(); i-- > 0;) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }

        }

        list.sort(Comparator.naturalOrder());
        System.out.println("Минимальное значение = " + list.get(0));
        System.out.println("Максимальное значение = " + list.get(list.size() - 1));
        int list_sum = 0;
        for (Integer i : list) {
            list_sum += i;
        }
        System.out.println("Среднее значение = " + list_sum / list.size());

    }
}