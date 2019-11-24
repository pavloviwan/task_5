import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задача № 5
 * Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
 * Использовать циклы запрещено.
 */
public class Task5 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String number = reader.readLine();
        Integer x = Integer.parseInt(number);
        System.out.println(x*1);
        System.out.println(x*2);
        System.out.println(x*3);
        System.out.println(x*4);
        System.out.println(x*5);
        System.out.println(x*6);
        System.out.println(x*7);
        System.out.println(x*8);
        System.out.println(x*9);
        System.out.println(x*10);

    }

}

