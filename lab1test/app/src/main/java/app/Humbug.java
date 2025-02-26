/*
 * This source file was generated by the Gradle 'init' task
 */
package app;

import java.util.ArrayList;

public class Humbug {
    private int size;
    private String name;
    private static int numHumbugs ;
    public Humbug(int size, String name) {
        if (size < 0) {
            throw new IllegalArgumentException("Invalid size");
        }
        this.size = size;
        this.name = name;
        this.numHumbugs++;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

 

    public static int getNumHumbugs() {
        return numHumbugs;
    }

    public String speak() {
         String result = "";
         int time = getSize();
         for (int i = 0; i < time; i++){
            result += getName() + " ";
            
         }return result;

    }

    public static int findLargest(
        int num[]) {
        int largest = 0;
        for (int i = 0; i < num.length; i++) {
            
            if (num[i] > largest) {
                largest = num[i];
            }
        }return largest;
  }

  public ArrayList<String> getVowels(String word) {
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            list.add(c);
        }
    }return list;
  }
}
