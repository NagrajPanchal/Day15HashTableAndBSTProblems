package com.bridgelabz;

public class MyMapNode <K, V> implements  INode<K>
{
        private K key;
        private V value;
        private MyMapNode<K, V> next;

        public MyMapNode(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }

        public K getKey() {
            return key;
        }

    public MyMapNode(K key) {
        this.key = key;
    }

    public MyMapNode() {
    }

        public void setKey(K key) {
            this.key = key;
        }
    public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public INode<K> getNext() {
            return next;
        }

    @Override
    public void setNext(INode<K> next) {
        this.next = (MyMapNode<K, V>) next;
    }

        @Override
        public String toString() {
            StringBuilder nodeString = new StringBuilder();
            nodeString.append(key).append(" | ").append(value).append("->");
            if (next != null)
                nodeString.append(" , ").append(next);
            return nodeString.toString();
        }
}
