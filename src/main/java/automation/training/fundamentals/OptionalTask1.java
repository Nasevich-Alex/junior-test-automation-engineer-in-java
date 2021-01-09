package automation.training.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OptionalTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        ArrayList<String> arrayList = new ArrayList();
        while (!(number.equals("-1"))) {
            arrayList.add(number);
            number = reader.readLine();
        }

        int min = 10, max = 0;
        String minStr = null, maxStr = null;
        for (String digi : arrayList) {
            System.out.println(digi);
            if (digi.length() < min) {
                min = digi.length();
                minStr = digi;
            }
            if (digi.length() > max) {
                max = digi.length();
                maxStr = digi;
            }
        }
        System.out.println("Минимальное число " + minStr + " состоит из " + min
                + " цифр\nМаксимальное число " + maxStr + " состоит из " + max
                + " цифр");
    }
}
