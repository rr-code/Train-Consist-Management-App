package main;

public class UseCase18LinearSearch {

    public static boolean searchBogie(String[] bogieIds, String key) {

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true; // found
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogies = {
                "BG101","BG205","BG309","BG412","BG550"
        };

        String searchKey = "BG309";

        boolean found = searchBogie(bogies, searchKey);

        System.out.println("Bogie Found: " + found);
    }
}
