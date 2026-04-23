package main;

import java.util.Arrays;

public class UseCase20SearchValidation {

    public static boolean searchBogie(String[] bogies, String key) {

        // ❗ Fail-fast check
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Binary Search logic
        Arrays.sort(bogies);

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = bogies[mid].compareTo(key);

            if (cmp == 0) {
                return true;
            }
            else if (cmp < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogies = {};

        try {
            boolean result = searchBogie(bogies, "BG101");
            System.out.println("Found: " + result);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}