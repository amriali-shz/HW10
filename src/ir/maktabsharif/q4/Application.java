package ir.maktabsharif.q4;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(4);
        myList.add(5);
        myList.add(1);
        myList.add(6);
        myList.add(3);
        System.out.println(showIteratedElements(myList));
    }
    public static HashSet<Integer> showIteratedElements (List<Integer> yourList) {
        HashSet<Integer> newSet = new HashSet<>();
        for (int i = 0; i < yourList.size(); i++) {
            for (int j = i + 1; j < yourList.size(); j++) {
                if (yourList.get(i) .equals(yourList.get(j))) {
                    newSet.add(yourList.get(i));
                }
             }
        }
        return newSet;
    }
}
