import java.util.Scanner;

public class daysToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of days:");
        int days = Integer.valueOf(scanner.nextLine());
        int seconds = days * 24 * 60 * 60;
        System.out.println(seconds);
    }
}
