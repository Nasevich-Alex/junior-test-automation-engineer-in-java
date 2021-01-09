package automation.training.fundamentals.maintask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Months {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        int com = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        while (number != 0) {
            sum += number;
            com *= number;
            number = Integer.parseInt(reader.readLine());
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + com);
    }
}
