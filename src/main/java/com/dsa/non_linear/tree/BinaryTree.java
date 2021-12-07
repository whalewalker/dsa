package com.dsa.non_linear.tree;

import lombok.Data;

import java.util.LinkedList;
import java.util.Queue;
@Data
public class BinaryTree<E> {

    private Node<E> root;
    private int size = 0;

    private Node<E> addRecursive(Node<E> current, int value){
        if (current == null)
            return new Node<>(value);

        if (value < current.getVal())
            current.setLeft(addRecursive(current.getLeft(), value));

        else if (value > current.getVal())
            current.setRight(addRecursive(current.getRight(), value));
        else
            return current;
        return current;

    }

    public void add(int value){
        root = addRecursive(root, value);
        size++;
    }


    public void breathFirst(Node<E> node){
        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(node);
        while (queue.size() > 0){
            Node<E> curr = queue.poll();
            System.out.println(curr.getVal());
            if (curr.getLeft() != null){
                queue.add(curr.getLeft());
            }
            if (curr.getRight() != null){
                queue.add(curr.getRight());
            }
        }
    }

    public void depthFirst(Node<E> node){

    }
}
