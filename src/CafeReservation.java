import java.util.Scanner;

public class CafeReservation {
    public static void main (String [] args){
        String name, gender, day, result;
        int age;
        double appearence, money;

        Scanner keyboard = new Scanner (System.in);

        result = "";

        System.out.println("Welcome to Reservation Cafe 79,\n");
        System.out.println("Please insert your name : ");
        name = keyboard.nextLine();

        System.out.println("How old are you ? : ");
        age = keyboard.nextInt();

        System.out.println("What is your gender ? (Male/Female) : ");
        gender = keyboard.next();

        System.out.println("How attractive are you ? (1 to 10): ");
        appearence = keyboard.nextDouble();

        System.out.println("How much money do you have ? : ");
        money = keyboard.nextDouble();

        System.out.println("What day do you want make a reservation ? : ");
        day = keyboard.next();

        if (day.equalsIgnoreCase("Monday")){
            if(age >= 20 && age <= 30 && money >= 500){
                result = "Reservation Successfully, you can order on monday, Young Night";
            } else {
                result = "Sorry, you can't order on monday, Because it's for Young Night";
            }

        } else if (day.equalsIgnoreCase("Tuesday")){
            if(age >= 31 && age <= 50 && money >= 250){
                result = "Reservation Successfully, you can order on Tuesday, Oldest Night";
            } else {
                result = "Sorry, you can't order on Tuesday, Because it's for Oldest Night";
            }
        } else if (day.equalsIgnoreCase("Wednesday")){
            if(gender.equalsIgnoreCase("Female") && age >= 20 && age <= 35 && appearence >= 8 && money >= 300){
                result = "Reservation Successfully, you can order on Wednesday, Ladies Night";
            } else {
                result = "Sorry, you can't order on Wednesday, Because it's for Ladies Night";
            }
        } else if (day.equalsIgnoreCase("Thursday")){
            if(gender.equalsIgnoreCase("Female") && age >= 21 && age <= 30 && appearence >= 8 && money >= 300){
                result = "Reservation Successfully, you can order on Thursday, Party Night for Single";
            } else if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 30 && money >= 1000){
                result = "Reservation Successfully, you can order on Thursday, Party Night for Single";
            } else {
                result = "Sorry, you can't order on Thursday, Because it's for Party Night for Single";
            }
        } else if (day.equalsIgnoreCase("Friday")){
            if(gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && money >= 1000){
                result = "Reservation Successfully, you can order on Friday, Women Night";
            } else if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25 && appearence >= 8){
                result = "Reservation Successfully, you can order on Friday, Women Night";
            } else {
                result = "Sorry, you can't order on Friday, Because it's for Women Night";
            }
        } else if (day.equalsIgnoreCase("Saturday")){
            if(age >= 18 && age <= 60 && money >= 100){
                result = "Reservation Successfully, you can order on Weekend Days, Weekend Freedom";
            } else {
                result = "Sorry, you can't order on Weekend Days, Because it's for Weekend Freedom";
            }
        }

        System.out.println();
        System.out.println("Hi " + name + ", Thank you for using our Application. ");
        System.out.println("Following Results for your reservation : ");
        System.out.println(result);
    }
}