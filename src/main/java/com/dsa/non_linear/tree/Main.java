package com.dsa.non_linear.tree;

public class Main {
    public static void main(String[] args) {

        BinaryTree<String> tree = new BinaryTree<>();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        tree.breathFirst(tree.getRoot());
        System.out.println("Tress size "+tree.getSize());
    }
}
