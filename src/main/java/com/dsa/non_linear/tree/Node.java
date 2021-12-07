package com.dsa.non_linear.tree;

import lombok.Data;

@Data
public class Node<E> {
    private int val;
    private Node<E> left;
    private Node<E> right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
