package ir.maktabsharif.q5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Application {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hi, this is a enumeration program.\nplease enter the number of inputs you want to write: ");
        int inputNumber = input.nextInt();
        System.out.println("Thank you; please enter " + inputNumber + " elements: ");
        HashMap<Integer, String> firstInput = new HashMap<>();
        for (int i = 0; i < inputNumber; i++) {
            System.out.println("element number " + (i + 1)  + ":");
            firstInput.put((i + 1), input.next());
        }
        System.out.println(firstInput);
        System.out.println("Loading ...");
        System.out.println("Now this a new map that inform you about how many frequented input you wrote:\n" + findIteratedValues(firstInput));


        System.out.println(findSameLength(findIteratedValues(firstInput)));
    }
    public static HashMap<String, Integer> findIteratedValues(HashMap<Integer, String> integerStringHashMap) {
        HashMap<String, Integer> finalMap = new HashMap<>();

        for (String value : integerStringHashMap.values()) {
            finalMap.put(value, finalMap.containsKey(value) ? finalMap.get(value) + 1 : 1);
        }

        return finalMap;
    }

    public static HashMap<Integer, String[]> findSameLength (HashMap<String, Integer> stringIntegerHashMap) {
        HashMap<Integer, String[]> finalMap = new HashMap<>();
        for (int i = 0; i < stringIntegerHashMap.size(); i++) {
            if (stringIntegerHashMap.containsKey(i)) {
                finalMap.put(i, null);
            }
            for (int j = i + 1; j < stringIntegerHashMap.size(); j++) {
                if (stringIntegerHashMap.get(j).equals(stringIntegerHashMap.get(i))) {
                    String [] valueOfFinalMap = new String[stringIntegerHashMap.get(i)];
                    finalMap.put(i, valueOfFinalMap);
                }
            }
        }
        return finalMap;
    }
}
