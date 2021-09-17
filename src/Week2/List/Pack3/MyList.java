package Week2.List.Pack3;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Error capacity can not less than 0!!!");
        }
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Error index out of Capacity!!!");
        } else if (elements.length == index + 1) {
            ensureCapacity(1);
        }

        if (elements[index] == null) {
            size++;
            elements[index] = element;
        } else {
            if(size == elements.length) {
                ensureCapacity(1);
            }

            for (int position = size; position > index; position--) {
                elements[position] = elements[position-1];
            }

        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if(index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index out of Capacity");
        }

        E element = (E) elements[index];
        for(int i = 0; i < elements.length - 1; i++){
            elements[i] = elements[i+1];
        }
        elements[elements.length - 1] = null;
        return element;
    }

    public int size(){
        return size;
    }

    public MyList<E> clone(){
        MyList<E> List = new MyList<E>();
        List.elements = Arrays.copyOf(elements,size);
        List.size = size;
        return List;
    }

    public boolean contain(E e){
        return indexOf(e) >= 0;
    }

    public int indexOf(E o){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(this.elements[i].equals(o)){
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(E e){
        return contain(e);
    }

    public void ensureCapacity(int mincapacity){
        if(mincapacity >= 0){
            int newSize = this.elements.length + mincapacity;
            elements = Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: " + mincapacity);
        }
    }

    public int length(){
        return elements.length;
    }

    public E get(int index){
        return (E) elements[index];
    }

    public void clear(){
        size = 0;
        for(int i = 0;i<elements.length;i++){
            elements[i] = null;
        }
    }

}
