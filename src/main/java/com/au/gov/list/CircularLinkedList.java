package com.au.gov.list;

public class CircularLinkedList {
    public Node head = null;
    private Node tail = null;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addNodes(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }

        tail = newNode;
        tail.nextNode = head;
    }

    public void deleteHead() {
        if (head != null) {
            head = head.nextNode;
            tail.nextNode = head;
        }

    }

    public void traverseNElements(final int n) {
        for(int i=0; i< n; i++) {
            Node currentNode = head;
            head = head.nextNode;
            tail = currentNode;
        }
    }

}
