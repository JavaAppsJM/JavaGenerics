package be.vdab.tryouts;

import java.util.ArrayList;
import java.util.List;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack genericStack = new GenericStack();
        // Objects to put in generic stack
        int nbrMars = 7856;
        String tekstje = "slj dsfqklhjd dfdsq";
        List<String> stringList = new ArrayList<>();
        stringList.add("azertz");
        stringList.add("lkojhjdsqh");
        stringList.add("wxgrig");

        // Stack opvullen
        genericStack.push(nbrMars);
        genericStack.push(tekstje);
        genericStack.push(stringList);

        System.out.println(genericStack.toString());
    }
}
