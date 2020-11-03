package be.vdab.tryouts;

public class GenericArray<E> {
    private Object[] list = new Object[1000];

    public int getSize() {
            return list.length;
            }

    public Object peek() {
        return list[list.length-1]; }

    public void push(Object o) {
            list[list.length] = o;
            }

    public Object pop() {
    Object o = list[list.length-1];
    list[list.length-1] = null;
    return o;
    }

    public boolean isEmpty() {
    if (list.length == 0){
         return true;
        } else{
         return false;
        }
    }
}
