package com.bridgelabz;

public class MyLinkedList<K>
{
        INode<K> head;

        INode<K> tail;

        public MyLinkedList() {
        }

        public void add(INode<K> newNode) {
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                INode<K> tempNode = head;
                head = newNode;
                head.setNext(tempNode);
            }
        }

        INode<K> search(K searchData) {
            INode<K> temp = head;
            while (temp != null) {
                if (temp.getKey().equals(searchData)) {
                    return temp;
                }
                temp = temp.getNext();
            }
            return null;
        }

        public INode<K> pop() {
            INode<K> tempNode = this.head;
            this.head = head.getNext();
            return tempNode;
        }

        public void display() {
            INode<K> temp = head;
            if (head == null) {
                System.out.println("Linked List is empty");
            }
            while (temp != null) {
                System.out.print(temp.getKey() + " ");
                temp = temp.getNext();
            }
        }

        @Override
        public String toString() {
            return " \n{" + head + "}";
        }
}
