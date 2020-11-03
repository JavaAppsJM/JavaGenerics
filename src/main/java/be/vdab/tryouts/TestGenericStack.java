package be.vdab.tryouts;

import java.util.ArrayList;
import java.util.List;

public class TestGenericStack {
    public static void main(String[] args) {
        // GenericStack
        GenericStack genericStack = new GenericStack();

        // GenericStackArray
        GenericStackArray genericStackArray = new GenericStackArray();

        // Objects to put in generic stack
        int nbrMars = 7856;
        String tekstje = "slj dsfqklhjd dfdsq";
        List<String> stringList = new ArrayList<>();
        stringList.add("azertz");
        stringList.add("lkojhjdsqh");
        stringList.add("wxgrig");

        // Generic stack fill
        genericStack.push(nbrMars);
        genericStack.push(tekstje);
        genericStack.push(stringList);

        // GenericStackArray fill
        genericStackArray.push(stringList);
        genericStackArray.push(tekstje);
        genericStackArray.push(nbrMars);

        // Display genericStack content
        System.out.println(genericStack.toString());
        System.out.println(genericStackArray.toString());
    }
}
