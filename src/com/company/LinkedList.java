package com.company;

public class LinkedList {
        Node head;
        Node tail;

        public String toString() {
            System.out.println("Elements in this List :\t");
            StringBuilder stringBuilder = new StringBuilder();
            Node current = head;
            if (head == null) {
                return "No Elements";
            } else {
                while (current != null) {
                    stringBuilder.append(current.data + "\t");
                    current = current.next;
                }
            }
            return stringBuilder.toString();
        }

        public void printList() {
            System.out.println(this);
        }

        public void appendData(int data) {
            if (head == null) {
                head = new Node(data);
                tail = head;
                return;
            } else {
                if (tail.next != null) {
                    tail.next.next = new Node(data);
                    return;
                }
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(data);
                tail = current.next;
            }
        }

        public void addPrioLinear(int data) {
            int depth =  0;
            if (head == null) {
                head = new Node(data);
            } else if(head.data > data) {
                Node temp = new Node(data);
                temp.next = head;
                head = temp;
                return;
            }
           else {
                Node current = head;
                while (current.next != null && current.next.data < data) {
                    current = current.next;
                }
                Node nxt = current.next;
                current.next = new Node(data);
                current.next.next = nxt;
            }
        }

    public void addPrioConstant(Node node, int data) {
            if(node.data <= data && data <= node.next.data){
                Node newNode = new Node(data);
                Node temp = node.next;
                node.next = newNode;
                newNode.next = temp;
            }
            else
                System.out.println("oops wrong fuckerhy");
          // node ≤ >  node.next

    }

        public Node removeData(int data) {
            Node returnNode = null;
            if (head.data == data) {
                returnNode = head;
                head = head.next;
                return returnNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    if (current.next.data == data) {
                        returnNode = current.next;
                        current.next = current.next.next;
                        return returnNode;
                    }
                    current = current.next;
                }
            }
            return null;
        }

        public Node PrioRemoveConstant(){
            if(head == null){
                return null;
            }
            else{
                Node temp = head;
                head = head.next;
                return temp;
            }
        }

        public Node PrioRemoveLinear(){
            if(head == null){
                return null;
            }
            else{
                Node current = head;
                while(current.next != null){
                    current = current.next;
                }
                Node temp = current;
                current = null;
                return temp;
            }
        }

        public void appendNode(Node node) {

            if (head == null) {
                head = node;
                return;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = node;
            }
        }
    }

