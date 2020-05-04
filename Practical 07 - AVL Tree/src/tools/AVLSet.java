package tools;

import java.util.Collection;

public class AVLSet<E extends Comparable<E>> implements ISet<E> {

    int size;
    TreeNode<E> root;

    public AVLSet(){
        size = 0;
        root = null;
    }

    @Override
    public boolean add(E element) {
        if(size == 0){
            root = new TreeNode<E>(element);
            size += 1;
            return true;
        }
        int oldSize = size;
        root = insert(element, root);
        return size != oldSize;
    }

    private TreeNode<E> insert(E element, TreeNode<E> treeNode){
        if(treeNode.key.compareTo(element) == 0){
            return treeNode;
        } else if(treeNode.key.compareTo(element) > 0){// add tp left child as key>element
            if(treeNode.hasLeftChild()){
                treeNode.left = insert(element, treeNode.left);
             } else {
                treeNode.left = new TreeNode<E>(element);
                size += 1;
            }
        } else {
            if(treeNode.hasRightChild()){
                treeNode.right = insert(element, treeNode.right);
             } else {
                treeNode.right = new TreeNode<E>(element);
                size += 1;
            }
        }
        int newDepth = 0;
        if(treeNode.hasLeftChild()){
            newDepth = treeNode.left.depth;
        }
        if(treeNode.hasRightChild()){
            newDepth = Math.max(newDepth, treeNode.right.depth);
        }
        treeNode.depth = newDepth + 1;
        return balance(treeNode);
    }

    @Override
    public boolean addAll(Collection<E> elements) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean contains(E element) {      
        return contains(element, root);
    }

    private boolean contains(E element, TreeNode<E> treeNode){
        if(treeNode == null){
            return false;
        }
        if(treeNode.key.compareTo(element) == 0){
            return true;
        } else if (treeNode.key.compareTo(element) > 0){
            if(treeNode.hasLeftChild()){
                return contains(element, treeNode.left);
            } else {
                return false;
            }
        } else {
            if(treeNode.hasRightChild()){
                return contains(element, treeNode.right);
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(E element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeAll(Collection<E> elements) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Convenience method to do a left rotation on tree x. The name of variables match the names from the seminar for pedagogical purpose. this is not an example to follow.
     * @param x
     * @return the tree after left rotation has been done.
     */
    private TreeNode<E> rotationLeft(TreeNode<E> x){
        TreeNode<E> y = x.right;
        TreeNode<E> b = y.left;
        x.right = b;
        y.left = x;
        int xDepth = 0;

        // The order in which you update the depth matters. must update children of a node first before updating the parent.
        if(x.hasLeftChild()){
            xDepth = x.left.depth;
        }
        if(x.hasRightChild()){
            xDepth = Math.max(xDepth, x.right.depth);
        }
        x.depth = xDepth + 1;
        y.depth = Math.max(y.right.depth, y.left.depth) + 1;
        return y;
    }

    /**
     * Convenience method to do a Rigth rotation on tree x. The name of variables match the names from the seminar for pedagogical purpose. this is not an example to follow.
     * @param y
     * @return the tree after right rotation has been done.
     */
    private TreeNode<E> rotationRight(TreeNode<E> y){
        TreeNode<E> x = y.left;
        TreeNode<E> b = x.right;
        y.left = b;
        x.right = y;
        int yDepth = 0;

        // The order in which you update the depth matters. must update children of a node first before updating the parent.
        if(y.hasLeftChild()){
            yDepth = y.left.depth;
        }
        if(y.hasRightChild()){
            yDepth = Math.max(yDepth, y.right.depth);
        }
        y.depth = yDepth + 1;
        x.depth = Math.max(x.right.depth, x.left.depth) + 1;
        return x;
    }

    /**
     * convenience method to compute the balance factor of a node, that is:
     * depth(leftBranch) - depth(rightBranch)
     * 
     * @param tree
     * @return
     */
    private int balanceFactor(TreeNode<E> tree){
        int factor = 0;
        if(tree.hasLeftChild()){
            factor += tree.left.depth;
        }
        if(tree.hasRightChild()){
            factor -= tree.right.depth;
        }
        return factor;
    }

    /**
     * Convenience method to rebalance a tree after a node has been added or removed. If the tree is balanced, does nothing.
     * @param tree
     * @return The balanced tree.
     */
    private TreeNode<E> balance(TreeNode<E> tree){
        if (balanceFactor(tree) == 2){
            if(balanceFactor(tree.left) == -1){
                tree.left = rotationLeft(tree.left);
                return rotationRight(tree);
            } else {
                return rotationRight(tree);
            }
        }else if (balanceFactor(tree) == -2){
            if(balanceFactor(tree.right) == 1){
                tree.right = rotationRight(tree.right);
                return rotationLeft(tree);
            } else {
                return rotationLeft(tree);
            }
        } else {
            return tree;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        // This is not the proper way to do a toString() on a set, The formatting has been chosen to help debugging by representing the set as a tree [parentKey, leftChild, rightChildren].
        if(root == null){
            return "[]";
        }
        return root.toString();
    }

    public static void main(String[] args) {
        AVLSet<Integer> set = new AVLSet<>();
        System.out.println(set);
        set.add(0);
        System.out.println("+ 0 --> "+set);
        set.add(1);
        System.out.println("+ 1 --> "+set);
        set.add(2);
        System.out.println("+ 2 --> "+set);
        set.add(3);
        System.out.println("+ 3 --> "+set);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("+ 4 --> "+set);
        System.out.println(set.contains(1));
        System.out.println(set.contains(6));
        System.out.println(set.contains(0));
        System.out.println(set.contains(5));
        System.out.println(set.contains(7));
    }


    
}

class TreeNode<T extends Comparable<T>>{

    int depth; // the depth/height of the tree. an empty tree has a depth of 0,
                // a leaf has a depth of 1.
    T key;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(){
        depth = 1;
        key = null;
        left = null;
        right = null;
    }

    public TreeNode(T key){
        depth = 1;
        this.key = key;
        left = null;
        right = null;       
    }

    public TreeNode(T key, TreeNode<T> leftNode, TreeNode<T> rightNode){
        depth = 1;
        this.key = key;
        left = leftNode;
        right = rightNode;
    }

    public boolean hasLeftChild(){
        return left != null;
    }

    public boolean hasRightChild(){
        return right != null;
    }

    @Override
    public String toString() {
        StringBuffer output = new StringBuffer("[" + key + "("+depth+")"+", ");
        if(hasLeftChild()){
            output.append(left + ", ");
        } else {
            output.append("#, ");
        }
        if(hasRightChild()){
            output.append(right + "]");
        } else {
            output.append("#]");
        }
        return output.toString();
    }
}