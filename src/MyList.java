import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    private Object[] copyArray(Object[] e, int size){
        Object[] newArr = new Object[size];
        for (int i = 0; i < e.length; i++) {
            newArr[i] = e[i];
        }

        return newArr;
    }

    public int size() {
        return size;
    }

    private void ensureCapa() {

        int newSize = elements.length + 1;
        elements = copyArray(elements, newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public void add(int index, E element){


        if(size == elements.length){
               ensureCapa();
                for (int i = size; i > index ; i--) {
                    elements[i] = elements[i - 1];
                }
                elements[index] = element;
                size++;
        }

    }
    public E get(int index){
        return (E)elements[index];
    }
    public E remove(int index){
        E element = (E) elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        return element;
    }
    public boolean contains(Integer o){
        for (Object e: elements){
            if (e.equals(o))return true;
        }
        return false;
    }
    public int indexOf(Object o){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(0))return i;
        }
        return -1;
    }
    public void clear(){
      Object[]  elementsNew = new Object[DEFAULT_CAPACITY];
      elements = elementsNew;
      size=0;
    }
    public MyList clone(){
        MyList newMyList = new MyList();
        for (int i = 0; i < size; i++) {
            newMyList.add(elements[i]);
        }
        return newMyList;
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }
        else{
            Object[] newStr = new Object[size];
            for (int i = 0; i < size; i++) {
                newStr[i] =  elements[i];
            }
            return Arrays.toString(newStr);
        }

    }
}
