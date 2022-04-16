import java.util.Scanner;

public class StringTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); //эта строка нужна чтобы пропустить символ перехода на новую строку
        // т.к при вводе числа в консоль вводится ещё и '\n'
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        int lengthSum = 0;
        for (String string : strings) {
            lengthSum += string.length();
        }
        double average = lengthSum / (double) strings.length;
        System.out.println("Средняя дина строк - " + lengthSum);
        for (String string : strings) {
            if (string.length() > average) {
                System.out.println(string + " имеет длину " + string.length());
            }
        }
    }
}
