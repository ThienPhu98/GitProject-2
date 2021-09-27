package Week3.Framework.Pack7and9;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }
    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }

    @Override
    public TreeNode<E> remove(E e) {
        return removeItem(e, root);
    }

    protected TreeNode<E> removeItem(E element, TreeNode<E> current) {
        if (current == null) {
            return current;
        }
        if (current.element.compareTo(element) > 0) {
            current.left = removeItem(element, current.left);
        } else if (current.element.compareTo(element) < 0) {
            current.right = removeItem(element, current.right);
        } else {
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }
            current.element = minValue(current.right);
            current.right = removeItem(current.element, current.right);
        }
        return current;
    }

    protected E minValue(TreeNode<E> current) {
        E value = current.element;
        while (current.left != null) {
            value = current.left.element;
            current = current.left;
        }
        return value;
    }

    @Override
    public boolean search(E e) {
        return searchItem(e, root);
    }

    protected boolean searchItem(E key, TreeNode<E> current) {
        if (current == null) {
            return false;
        }
        if (current.element.compareTo(key) == 0) {
            return true;
        } else if (current.element.compareTo(key) < 0) {
            return searchItem(key, current.right);
        } else if (current.element.compareTo(key) > 0) {
            return searchItem(key, current.left);
        }
        return false;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void postOrder() {
        postOrder(root);
    }

    @Override
    public void preOrder() {
        preOrder(root);
    }

    protected void postOrder(TreeNode<E> root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.element + " ");
    }

    protected void preOrder(TreeNode<E> root) {
        if (root == null) return;
        System.out.print(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
