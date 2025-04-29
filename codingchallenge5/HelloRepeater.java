package codingchallenge5;
import java.util.Scanner;

public class HelloRepeater {
    private Scanner scanner = new Scanner(System.in);

    public void startRepeating() {
        String userInput;

        System.out.println("Type 'h' to hear a hello message. Type anything else to stop.");

        userInput = scanner.next();

        while ("h".equalsIgnoreCase(userInput)) {
            System.out.println(" Hey there! Hello again!");
            System.out.print("Want another hello? Type 'h' or anything else to exit: ");
            userInput = scanner.next();
        }

        System.out.println(" Goodbye! Thanks for chatting.");
    }
    public static void main(String[] args) {
        HelloRepeater repeater = new HelloRepeater();
        repeater.startRepeating();
    }
}
