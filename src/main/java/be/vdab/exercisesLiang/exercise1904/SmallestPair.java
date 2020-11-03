package be.vdab.exercisesLiang.exercise1904;


import be.vdab.exercisesLiang.exercise1903.Pair;

public class SmallestPair {
    public static void main(String[] args) {
        Integer integer1 = 58236;
        Integer integer2 = 5826;


        Pair<Integer> pair = new Pair<>(integer1,integer2);
        pair.printPair();
        System.out.println("smallest: "+ smallestPair(pair));

    }

    public static <E> Integer smallestPair(Pair<? extends Integer> pair){
        if (pair.getAttribute1() <= pair.getAttribute2()){
            return pair.getAttribute1();
        }else{
            return pair.getAttribute2();
        }
    }
}
