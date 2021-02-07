package automation.training.fundamentals.maintask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Months {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println(selectMonth(number));
    }
    public static String selectMonth(int n){
        String[] months = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль",
                "Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        if(n >= 1 && n <= months.length) {
            return months[n-1];
        }
        return "Введите число от 1 до 12 (включительно)";
    }
}
