import java.util.Scanner;
public class scanner {
    Scanner sc = new Scanner(System.in);
    public void readNameAndAge() {
        String name;
        int age;
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age);
    }
    public static void main(String[] args) {
        scanner sc = new scanner();
        sc.readNameAndAge();
    }
}
