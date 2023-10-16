import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PracticeOne {
    private static final DecimalFormat DF = new DecimalFormat("00.00");

    public static void main(String[] args) {
        // BMI calculate
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Type your weight(kg): ");
//        double weight = scanner.nextDouble();
//
//        System.out.println("Type your height(cm): ");
//        double height = scanner.nextDouble() / 100;
//
//        double bmi = Double.parseDouble(DF.format(weight / (height * height)));
//        System.out.println("Your BMI is: " + bmi);
//
//        if (bmi < 18.5) {
//            System.out.println("Too less");
//        } else if (bmi < 24) {
//            System.out.println("Normal");
//        } else if (bmi < 30) {
//            System.out.println("A little fat");
//        } else {
//            System.out.println("Too fat");
//        }

        // Vaccine search
        String vaccine = JOptionPane.showInputDialog("Please type vaccine name");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az")) {
            JOptionPane.showMessageDialog(null, "AZ\nProtection");
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showMessageDialog(null, "BNT\nProtection");
        } else if (vaccine.equals("modera")) {
            JOptionPane.showMessageDialog(null, "莫德納\nProtection");
        } else if (vaccine.equals("jassen")) {
            JOptionPane.showMessageDialog(null, "嬌生\nProtection");
        } else {
            JOptionPane.showMessageDialog(null, "Type error");
        }
    }
}
