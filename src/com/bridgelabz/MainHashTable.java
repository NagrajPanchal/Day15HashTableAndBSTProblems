package com.bridgelabz;

public class MainHashTable
{
    public static void main(String[] args)
    {
        MyHashTable<String, Integer> hashTable1 = new MyHashTable<>(10);
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] array = paragraph.split(" ");
        for (String str:array) {
            Integer frequencyValue = hashTable1.findFrequency(str);
            if (frequencyValue==null){
                frequencyValue=1;
            }else {
                frequencyValue+=1;
            }
            hashTable1.add(str,frequencyValue);
        }
        System.out.println(hashTable1);
    }
}
