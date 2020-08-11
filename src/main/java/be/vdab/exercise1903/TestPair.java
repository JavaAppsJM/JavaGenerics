package be.vdab.exercise1903;

public class TestPair {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        object1 = 456;
        object2 = "dfsf";

        String string1 = "gdflgsdh";
        String string2 = "iudfhj";

        Integer integer1 = 58236;
        Integer integer2 = 5826;


        Pair<Object> pair = new Pair<>(object1,object2);
        pair.printPair();
        //System.out.println("pair of objects : " + pair.getAttribute1() + " ; " + pair.getAttribute2());

        pair.setAttribute1(string1);
        pair.setAttribute2(string2);
        pair.printPair();

        pair.setAttribute1(integer1);
        pair.setAttribute2(integer2);
        pair.printPair();

    }
}
