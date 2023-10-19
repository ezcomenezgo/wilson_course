import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class PracticeOne {
    private static final DecimalFormat DF = new DecimalFormat("00.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // BMI calculate
        System.out.print("Type your weight(kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Type your height(cm): ");
        double height = scanner.nextDouble() / 100;

        double bmi = Double.parseDouble(DF.format(weight / (height * height)));
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Too less");
        } else if (bmi < 24) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("A little fat");
        } else {
            System.out.println("Too fat");
        }

        // Vaccine search
        String vaccine = JOptionPane.showInputDialog("Please type vaccine name");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az")) {
            JOptionPane.showMessageDialog(null, "AZ\nProtection");
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showMessageDialog(null, "BNT\nProtection");
        } else if (vaccine.equals("Modena")) {
            JOptionPane.showMessageDialog(null, "莫德納\nProtection");
        } else if (vaccine.equals("jassen")) {
            JOptionPane.showMessageDialog(null, "嬌生\nProtection");
        } else {
            JOptionPane.showMessageDialog(null, "Type error");
        }

        // guess number
        int start = 0;
        int end = 100;
        // Instance of random class
        Random rand = new Random();
        // Setting the upper bound to generate the random numbers in specific range
        int upperbound = 100;
        // Generating random values from 0 - 24
        // using nextInt()
        int ansNum = rand.nextInt(upperbound);
        // if guessNum < ans
        // guessNum -> 100
        // if guessNum > ans
        // 1 -> guessNun
        while (true) {
            System.out.print("From " + start + " to " + end + ". Type a number: ");
            int guessNum = scanner.nextInt();
            if (guessNum > end || guessNum < start) {
                System.out.println("out of the range!");
                continue;
            }

            if (guessNum == ansNum) {
                System.out.println("You guess right!");
                break;
            }

            if (guessNum < ansNum) {
                start = guessNum;
            } else {
                end = guessNum;
            }
        }
    }
}
