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
    public Boolean deletion(K deleteData){
        INode<K> deleteNode=search(deleteData);
        INode<K> temp = head;
        while (temp!=null) {
            if (temp == deleteNode){
                head = deleteNode.getNext();
                break;
            }
            else if (temp.getNext() == deleteNode) {
                temp.setNext(deleteNode.getNext());
                deleteNode.setNext(null);
                return true;
            }
            temp=temp.getNext();
        }
        return false;
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

    public void printMyNodes() {
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
