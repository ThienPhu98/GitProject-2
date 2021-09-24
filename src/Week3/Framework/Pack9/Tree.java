package Week3.Framework.Pack9;

public interface Tree<E> {
    public boolean insert(E e);

    public int getSize();

    public void postOrder();

    public void preOrder();
}
