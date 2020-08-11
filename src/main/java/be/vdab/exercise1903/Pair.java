package be.vdab.exercise1903;

public class Pair<E> {
    private E attribute1;
    private E attribute2;

    public Pair(E attribute1, E attribute2) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    public E getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(E attribute1) {
        this.attribute1 = attribute1;
    }

    public E getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(E attribute2) {
        this.attribute2 = attribute2;
    }

    public void printPair() {
        System.out.println( "Pair{" +
                "attribute1=" + attribute1 +
                ", attribute2=" + attribute2 +
                '}');
    }
}
