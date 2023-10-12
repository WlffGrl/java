import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args) {
        String name;
        int moneySpent;
        Double average;
        int total;
        int totalDay = 7;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello, What is your name ?");
        name = keyboard.next();

        System.out.println("How much money did you spent in Monday ?");
        moneySpent = keyboard.nextInt();

        total = moneySpent;

        System.out.println("How much money did you spent in Tuesday ?");
        moneySpent = keyboard.nextInt();

        total = total + moneySpent;

        System.out.println("How much money did you spent in Wednesday ?");
        moneySpent = keyboard.nextInt();

        total = total + moneySpent;

        System.out.println("How much money did you spent in Thursday ?");
        moneySpent = keyboard.nextInt();

        total = total + moneySpent;

        System.out.println("How much money did you spent in Friday ?");
        moneySpent = keyboard.nextInt();

        total = total + moneySpent;

        System.out.println("How much money did you spent in Saturday ?");
        moneySpent = keyboard.nextInt();

        total = total + moneySpent;

        System.out.println("How much money did you spent in Sunday ?");
        moneySpent = keyboard.nextInt();

        total = total + moneySpent;

        average = (double) total / totalDay;

        System.out.println("the calculation result :");
        System.out.println("Hello " + name + "!");
        System.out.println("Your total expenditure at the club this week is $ " + total);
        System.out.println("with an average daily expenditure of $ " + average);

    }

}
