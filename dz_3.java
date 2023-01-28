import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Consumer;

// 1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.
// Удалить из первого списка элементы отсутствующие во втором списке.
// Отсортировать первый список методом sort класса Collections.

public class dz_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list_2 = new ArrayList<Integer>();

        Random rnd = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(20));
        }
        for (int i = 0; i < 20; i++) {
            list_2.add(rnd.nextInt(20));
        }

        System.out.println(list);
        System.out.println(list_2);
        list.removeAll(list_2);
        System.out.println(list);
        System.out.println(list_2);

        list.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
            
        });
        System.out.println(list);
    }
    
}