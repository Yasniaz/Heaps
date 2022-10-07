package com.company;

import com.sun.source.tree.BinaryTree;

public class Heaps {
    Node root;
    int size;

    Heaps(){
        size = 0;
    }

    public Node removeData() {
        if(root == null){
            return null;
        }
        else{
            return root.remove();
        }
    }


    public void addData(Integer key, Integer value) {
        if (root == null) {
            root = new Heaps.Node(key, value);
        } else {
            root.add(key, value);
        }

    }

    public void BinaryTree() {
        root = null;
    }

    public Integer lookup(Integer key) {
        return root == null ? null : root.lookUp(key);
    }

    public class Node {
        public Integer key;
        public Integer value;
        public Heaps.Node left;
        public Heaps.Node right;

        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
            this.left = this.right = null;
        }

        public Integer lookUp(Integer key) {
            if (this.key == key) {
                return this.value;
            } else if (this.key > key && this.left != null) {
                return this.left.lookUp(key);
            } else {
                return this.key < key && this.left != null ? this.right.lookUp(key) : null;
            }
        }

        public void print() {
            if (this.left != null) {
                this.left.print();
            }

            System.out.println(" key: " + this.key + "\tvalue: " + this.value);
            if (this.right != null) {
                this.right.print();
            }

        }

        public int getData() {
            return this.value;
        }

        public void swap(Integer x, Integer y){
            Integer temp = x;
            x = y;
            y = temp;
        }
        public void swapNode(Node n1, Node n2){
            Integer tempKey = n1.key;
            Integer tempData = n1.value;
            n1.key = n2.key;
            n1.value = n2.value;
            n2.key = tempKey;
            n2.value = tempData;
        }

        public Integer push(Integer incr){
            root.key = root.key + incr;
            Node current = root;
            Integer depth = 0;
            while(current.left.key < current.key || current.right.key < current.key) {
                if (root.key > root.left.key) {
                    System.out.println("Swapping current and current.left (" + root.value + " " +root.left.value + ")");
                 swapNode(current,current.left);
                    System.out.println("Swapped current and current.left (" + root.value + " " +root.left.value + ")");

                } else if(root.key > root.right.key) {
                    swapNode(current,current.right);                 }
                else{
                    break;
                }
                depth++;
            }
            return depth;
        }

        public Node remove() {

             if(size == 1){
                Node temp = root;
                root = null;
                size--;
                return temp;
            }
            else{
                if(this.left.key > this.right.key){
                    Node temp = root;
                    root = this.right;
                    root.left = temp.left;
                    size--;
                    return temp;
                }
                if(this.right.key > this.left.key){
                    Node temp = root;
                    root = this.left;
                    root.right = temp.right;
                    size--;
                    return temp;
                }
                if(this.left == null){
                    Node temp = root;
                    root = this.right;
                    size--;
                    return temp;
                }
                else{
                    Node temp = root;
                    root = this.left;
                    size--;
                    return temp;
                }
            }
        }
        Integer d = 0;
        public Integer add(Integer key, Integer value) {
            if (this.key == key) {
                this.value = value;
            } else {
                if (this.key < key) {
                    if (this.left == null) {
                        this.left = new Heaps.Node(key, value);
                        size++;

                    } else if (this.right == null) {
                        this.right = new Heaps.Node(key, value);
                        size++;
                    }else if(this.left.key < key){
                        this.left.add(key,value);
                        d++;
                    }
                    else if(this.right.key < key){
                        this.right.add(key,value);
                        d++;
                    }
                }
            }
            return d;
        }
    }
}

