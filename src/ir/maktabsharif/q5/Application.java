package ir.maktabsharif.q5;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

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

    public static HashMap<Integer, List<String>> findSameLength (HashMap<String, Integer> stringIntegerHashMap) {
        HashMap<Integer, List<String>> finalMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : stringIntegerHashMap.entrySet()) {
            String value = entry.getKey();
            int frequency = entry.getValue();
            List<String> list;
            if (finalMap.containsKey(frequency)) {
                list = finalMap.get(frequency);
            } else {
                list = new ArrayList<>();
                finalMap.put(frequency, list);
            }

            list.add(value);
        }
        return finalMap;
    }
}
