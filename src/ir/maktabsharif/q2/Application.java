package ir.maktabsharif.q2;

import java.util.ArrayList;
import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        ArrayList<Integer> secondArrayList = new ArrayList<>();

        firstArrayList.add(1);
        firstArrayList.add(1);
        firstArrayList.add(3);
        firstArrayList.add(2);
        firstArrayList.add(6);
        firstArrayList.add(8);

        secondArrayList.add(2);
        secondArrayList.add(4);
        secondArrayList.add(7);
        secondArrayList.add(9);
        secondArrayList.add(11);
        System.out.println(arrangeCombine(firstArrayList, secondArrayList));
    }
    public static ArrayList<Integer> arrangeCombine (ArrayList<Integer> firstArrayList, ArrayList<Integer> secondArrayList) {
        ArrayList<Integer> combinedArrayList = new ArrayList<>();
        combinedArrayList.addAll(firstArrayList);
        combinedArrayList.addAll(secondArrayList);
        Collections.sort(combinedArrayList);
        return combinedArrayList;
    }
}
