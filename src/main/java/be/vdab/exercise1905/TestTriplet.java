package be.vdab.exercise1905;

import be.vdab.exercise1903.Pair;

public class TestTriplet {
    public static void main(String[] args) {
        Object object1;
        Object object2;
        Object object3;

        object1 = 456;
        object2 = "dfsf";
        object3 = "hgqhgqq";


        Triplet<Object> treesome = new Triplet<>(object1,object2,object3);
        treesome.print3();

    }
}
