package ir.maktabsharif.q3;

import java.util.*;

public class Application {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your input:");
        String myInput = input.next();
        System.out.println(findLink(myInput));
    }

    private static String findLink(String input) {
        List <int[]> pathList = new LinkedList<>();
        Set<Integer> destination = new HashSet<>();
        Set<Integer> mySource = new HashSet<>();

        String[] pairs = input.split("\\|");
        for (String pair : pairs) {
            String[] numbers = pair.split(",");
            int from = Integer.parseInt(numbers[0]);
            int to = Integer.parseInt(numbers[1]);
            pathList.add(new int[]{from, to});
            mySource.add(from);
            destination.add(to);
        }
        int start = -1;
        for (int src : mySource) {
            if (!destination.contains(src)) {
                start = src;
                break;
            }
        }
        if (start == -1) {
            return "invalid input";
        }

        LinkedList<Integer> sequence = new LinkedList<>();
        sequence.add(start);

        while (true) {
            boolean found = false;
            for (Iterator<int[]> iterator = pathList.iterator(); iterator.hasNext(); iterator.hasNext()) {
                int[] pair = iterator.next();
                if (pair[0] == start) {
                    sequence.add(pair[1]);
                    start = pair[1];
                    iterator.remove();
                    found = true;
                    break;
                }
            }
            if (!found) break;
        }
        return String.join (" -> ", sequence.stream().map(String::valueOf).toList());
    }
}