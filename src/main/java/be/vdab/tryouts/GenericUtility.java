package be.vdab.tryouts;

public class GenericUtility {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        object1 = 456;
        object2 = 456;
        //object2 = "dfsf";

        String string1 = "gdflgsdh";
        String string2 = "gdflgsdh";
        //String string2 = "iudfhj";

        Integer integer1 = 58236;
        Integer integer2 = 5826;



        if(GenericUtility.isEqualTo(object1,object2)){
            System.out.println("objects are equal");
        } else {
            System.out.println("objects are not equal");
        }

        if (GenericUtility.isEqualTo(string1,string2)){
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        if (GenericUtility.isEqualTo(integer1,integer2)){
            System.out.println("integers are equal");
        } else {
            System.out.println("integers are not equal");
        }

    }

    public static <E> boolean isEqualTo(E parm1,E parm2){
            return parm1.equals(parm2);
    }
}
