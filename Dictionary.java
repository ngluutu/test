import java.util.Scanner;

public class Dictionary {
    Scanner sc = new Scanner(System.in);
    private static Word[] wordlist;
    private static int wordcount;
    public Dictionary(int n) {
        wordlist = new Word[n];
        wordcount = n;
    }

    public static int getWordcount() {
        return wordcount;
    }

    public void input() {
        for (int i = 0; i < getWordcount(); i++) {
            String target = sc.nextLine();
            String explain = sc.nextLine();
            wordlist[i] = new Word(target,explain);
        }
    }

    public static void output() {
        System.out.println("No         |English                     |Vietnamese");
        for (int i = 0; i < getWordcount(); i++) {
            int a = i+1;
            String eng = wordlist[i].getWord_target();
            int length = eng.length();
            String vni = wordlist[i].getWord_explain();
            System.out.print(a+"          |"+eng);
            for (int j = 0; j < 29-length-1; j++) {
                System.out.print(" ");
            }
            System.out.println("|" + vni);
        }
    }
}
