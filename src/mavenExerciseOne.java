import java.util.Scanner;
import static org.apache.commons.lang3.StringUtils.*;

public class mavenExerciseOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something:");
        String uInput = scan.nextLine();
        System.out.println("You entered, " + uInput);
        if (isNumeric(uInput)) {
            System.out.println("\"" + uInput + "\" is a number");
        } else {
            System.out.println("\"" + uInput + "\" is not a number");
        }
        System.out.println("Flipped case:" + swapCase(uInput));
        System.out.println("Reversed case:" + reverse(uInput));
    }
}