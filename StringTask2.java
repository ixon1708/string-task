import java.util.Scanner;

public class StringTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); //эта строка нужна чтобы пропустить символ перехода на новую строку
        // т.к при вводе числа в консоль вводится ещё и '\n'
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
