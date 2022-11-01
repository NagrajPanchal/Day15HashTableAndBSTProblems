package com.bridgelabz;

public class MyHashTable
{
        public static void main(String[] args) {

            String paragraph = "Paranoids are not paranoid because they are paranoid but " +
                    "because they keep putting themselves deliberately into paranoid avoidable situations";

            String[] words = paragraph.toLowerCase().split(" ");
            MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
            System.out.println(words);
        }

}
