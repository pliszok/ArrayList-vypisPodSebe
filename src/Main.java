import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printAllIntegersFromList(List<Integer> list) {
        int input = Support.safeReadInt();
        new ArrayList<>();
        while (input >= 0) {
            System.out.println("You entered: " + input);
            list.add(input);
            System.out.println("Enter another integer:");
            input = Support.safeReadInt();
        }
        if (input < 0) {
            System.out.println("You entered negative");
        }
        for (Integer integer : list)
            System.out.println(input);
    }

    public static void main(String[] args) {

        System.out.println("--- Task 4 - print all integers from list ---");
        printAllIntegersFromList(list);

    }
}
