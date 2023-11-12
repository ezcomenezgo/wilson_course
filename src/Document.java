import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Document {
    public static void main(String[] args) {

        // read files and count the length of file
        File f = new File("sleep.txt");
        int line_count = 0;
        int word_count = 0;
        int char_count = 0;
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNextLine()) {
                line_count++;
                String line = scanner.nextLine();
                String[] count_wordArr = line.split(" ");
                word_count += count_wordArr.length;
                char_count += line.length();
            }
            System.out.println("line count: " + line_count + " word count: " + word_count + " char count: " + char_count);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
