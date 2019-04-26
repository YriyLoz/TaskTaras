import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String readline = reader.readLine();
        char[] charArray = readline.toCharArray();
        if (charArray.length == 0) {
            System.out.println("You didn't write anything");
            return;
        }
        readerMetod(charArray);
    }

    public static void readerMetod(char[] charArray) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            int count = 0;
            for (int j = 1; j < charArray.length; j++) {
                if (c == charArray[j]) {
                    count++;
                }
            }
            map.put(c, count);
        }
        System.out.println(map.toString());
    }
}





