// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static int changeNum(int x) {
        return x = 30;
    }

    public static void printHi(int i) {
        if (i == 0) return;
        System.out.println("enter " + i);
        printHi(i - 1);
        System.out.println("finish " + i);
    }

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello world");
        String x = "test";
        String y = "test";
        System.out.println(x.equals(y));

        String[] array = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 strings");
        array[0] = scanner.nextLine();


        System.out.println(array[0]);
        StringBuilder input1 = new StringBuilder();
        input1.append(array[0]);
        input1.reverse();
        System.out.println(input1);

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.

        // Press Ctrl+D to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Cmd+F8.

        // Array
        String[] friends = {"Abby", "Ben", "Claire"};

        // 2D Array
        // it means the outer array can put 3 arrays inside
        // and inner arrays can put 3 integer values
        int[][] first2DArr = new int[3][3];
        // assign 5 to second index of second array in first2DArr
        first2DArr[2][2] = 5;

        // For loop
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i] + " is my friend");
        }

        // For loop enhance version
        // declare a variable first (can call anything)
        // use ":" means "in" the specific array
        // then put the array you want to loop
        for (String friend : friends) {
            System.out.println(friend + " is my friend");
        }

        // while loop
        // remember to set the stop rule
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        // primitive type will copy by value
        int a = 10;
        changeNum(a);
        System.out.println(a);

        // non-primitive value will copy by reference
        // even in function when an object to be a params, Java will do the same copy by reference thing
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1;
        arr2[0] = 100;
        for (int j = 0; j < arr1.length; j++) {
            System.out.println("arr1: " + arr1[j]);
        }

        // recursive function
        printHi(10);
    }
}