import java.util.*;

public class Round2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter size: ");
        int size = scan.nextInt();
        String[] words = new String[size];

        words[0] = null;
        String answer = "true";

        for (int i = 0; i < size; i++) {
            System.out.println("enter a word: (quit to quit)");
            words[i] = scan.nextLine();
        }

        for (int i = 1; i < size - 1; i++) {
            for (int j = 0; j < size; j++) {
                if(words[i] == words[j]) {
                    answer = "false";
                }
            }

            if (words[i].substring(words[i - 1].length() - 1, words[i].length()) != words[i].substring(0, 1)) {
                answer = "false";
            }

            answer = "true";
        }

        System.out.print(answer);
    }
}