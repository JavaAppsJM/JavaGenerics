package be.vdab.exercisesLiang.exercise1908;

import java.util.ArrayList;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringlist = new ArrayList<>();

        stringlist.add("dgdhd");
        stringlist.add("klh");
        stringlist.add("hjglhk");
        stringlist.add("ezarez");
        stringlist.add("mliuy");
        stringlist.add("tyuddx");

        shuffle(stringlist);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        int j;
        for (int i = 0; i < list.size(); i++) {
            j = (int) Math.floor(Math.random() * list.size());
            E help = list.get(i);
            list.set(i, list.get(j));
            list.set(j, help);
        }
        // Display list
        for (E arrayElement: list
             ) {
            System.out.println(arrayElement);
        }
    }
}
