package basic.zsy.tree;

public class BSTree<T extends Comparable<T>> {

    private BSTNode<T> mRoot;    // 根结点

    public class BSTNode<T extends Comparable<T>> {
        public T key;                // 关键字(键值)
        public BSTNode<T> left;      // 左孩子
        public BSTNode<T> right;     // 右孩子
        public BSTNode<T> parent;    // 父结点

        public BSTNode(T key, BSTNode<T> parent, BSTNode<T> left, BSTNode<T> right) {
            this.key = key;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }
}
