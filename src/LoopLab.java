import java.util.Scanner;

public class LoopLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        int num = scanner.nextInt();
        System.out.println("Type 'M' or 'A'(M: multiplication, A: addition)");
        String str = scanner.next().toUpperCase();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                // multiplication
                if (str.equals("M")) System.out.println("i * j: " + i + " * " + j + " = " + i * j);
                    // addition
                else System.out.println("i + j: " + i + " + " + j + " = " + (i + j));
            }
        }
    }
}
