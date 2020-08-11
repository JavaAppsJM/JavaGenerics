package be.vdab.exercise1910;

import java.util.ArrayList;

public class SmallestInArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringlist = new ArrayList<>();

        stringlist.add("dgdhd");
        stringlist.add("klh");
        stringlist.add("hjglhk");
        stringlist.add("ezarez");
        stringlist.add("mliuy");
        stringlist.add("tyuddx");

        System.out.println("smallest element : " + smallestIn(stringlist));
    }

    public static <E extends Comparable<E>> E smallestIn(ArrayList<E> list) {
        E smallestElement = list.get(0);

        for (int i = 1; i < list.size() ; i++) {
            if (smallestElement.compareTo(list.get(i)) > 0) {
                smallestElement = list.get(i);
            }
        }
        return smallestElement;
    }
}
