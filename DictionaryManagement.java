import java.util.Scanner;

public class DictionaryManagement {
    public static void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dictionary dictionary = new Dictionary(n);
        dictionary.input();
    }
}
