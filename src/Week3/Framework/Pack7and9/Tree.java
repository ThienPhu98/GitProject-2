package Week3.Framework.Pack7and9;

public interface Tree<E> {
    public TreeNode<E> remove(E e);

    public boolean search(E e);

    public boolean insert(E e);

    public int getSize();

    public void postOrder();

    public void preOrder();
}
