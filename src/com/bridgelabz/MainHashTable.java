package com.bridgelabz;

public class MainHashTable
{
    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable1 = new MyHashTable<>(10);
        String paragraph = "To be or not to be";
        String[] array = paragraph.split(" ");
        for (String str : array) {
            Integer frequencyValue = hashTable1.findFrequency(str);
            if (frequencyValue == null) {
                frequencyValue = 1;
            } else {
                frequencyValue += 1;
            }
            hashTable1.add(str, frequencyValue);
        }
        System.out.println(hashTable1);
    }
}
