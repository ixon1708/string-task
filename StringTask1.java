import java.util.Scanner;

public class StringTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); //эта строка нужна чтобы пропустить символ перехода на новую строку
        // т.к при вводе числа в консоль вводится ещё и '\n'
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        String shortest = strings[0];
        String longest = strings[0];
        for (String str: strings) {
            if (shortest.length() > str.length()) {
                shortest = str;
            }
            if (longest.length() < str.length()) {
                longest = str;
            }
        }
        System.out.println("Самая длинная введённая строка: " + longest);
        System.out.println("Самая короткая введённая строка: " + shortest);
        for (String str: strings) {
            System.out.println(str + " имеет длину " + str.length());
        }
    }
}
