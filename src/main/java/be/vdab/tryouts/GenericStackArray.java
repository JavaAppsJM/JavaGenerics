package be.vdab.tryouts;

import java.util.Arrays;

public class GenericStackArray<E> {
    private Object[] list = new Object[100];
    private int nbrOfelements = 0;

    public int getNbrOfelements() {
        return nbrOfelements;
    }

    public void setNbrOfelements(int nbrOfelements) {
        this.nbrOfelements = nbrOfelements;
    }

    public int getSize() {
            return nbrOfelements;
            }

    public Object peek() {
        return list[nbrOfelements-1]; }

    public void push(Object o) {
        list[nbrOfelements] = o;
        nbrOfelements++;
    }

    public Object pop() {
    Object o = list[nbrOfelements-1];
    list[nbrOfelements-1] = null;
    nbrOfelements--;
    return o;
    }

    public boolean isEmpty() {
    if (nbrOfelements == 0){
         return true;
        } else{
         return false;
        }
    }

    @Override
    public String toString() {
        return "GenericStackArray{" +
                " nbrOfelements=" + nbrOfelements +
                ", list=" + Arrays.toString(list) +
                '}';
    }
}
