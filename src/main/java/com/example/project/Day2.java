
package com.example.project;
import java.util.Random;
public class Day2{
    public static String[][] nameSort(String[] names) { // your will be tested on this nethod
        String[][] list = new String[2][names.length];
        for (int i = 0; i < names.length; i++) {
            int random = (int) (Math.random() * 2); 
            list[random][i] = names[i];
        }
        return list; //you must return a two dimensional string array
    }
 public static void main(String[] args) {
    String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry","Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
    System.out.println(nameSort (names));
    }
 }
 