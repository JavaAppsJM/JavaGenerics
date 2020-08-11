package be.vdab.exercise1909;

import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringlist = new ArrayList<>();

        stringlist.add("dgdhd");
        stringlist.add("klh");
        stringlist.add("hjglhk");
        stringlist.add("ezarez");
        stringlist.add("mliuy");
        stringlist.add("tyuddx");

        sort(stringlist);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E tmpElement;

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    tmpElement = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,tmpElement);
                }
            }
        }
        // Display list
        for (E arrayElement: list
        ) {
            System.out.println(arrayElement);
        }
    }
}
