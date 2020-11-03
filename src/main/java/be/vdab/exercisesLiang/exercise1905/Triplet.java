package be.vdab.exercisesLiang.exercise1905;

import be.vdab.exercisesLiang.exercise1903.Pair;

public class Triplet<E> extends Pair<E> {
    private E attribute3;

    public Triplet(E attribute1, E attribute2, E attribute3) {
        super(attribute1, attribute2);
        this.attribute3 = attribute3;
    }

    public void print3() {
        super.printPair();
        System.out.println( "Triplet{" +
                "attribute3=" + attribute3 +
                '}');
    }
}
