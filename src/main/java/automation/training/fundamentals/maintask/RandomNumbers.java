package automation.training.fundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfNumbers = Integer.parseInt(reader.readLine());
        Random random = new Random(47);

        for (int i = 0; i < countOfNumbers; i++) {
            int x = random.nextInt(25);
            System.out.println(x);
        }
        for (int i = 0; i < countOfNumbers; i++) {
            int x = random.nextInt(25);
            System.out.print(x + " ");
        }
    }
}
