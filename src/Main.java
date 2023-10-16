// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello world");
        String x = "test";
        String y = "test";
//        System.out.println(x.equals(y));

        String[] array = new String[5];

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter 5 strings");
        array[0]=scanner.nextLine();



        System.out.println(array[0]);
        StringBuilder input1 = new StringBuilder();
        input1.append(array[0]);
        input1.reverse();
        System.out.println(input1);

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.

        // Press Ctrl+D to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Cmd+F8.
    }
}