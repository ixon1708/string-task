import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); //эта строка нужна чтобы пропустить символ перехода на новую строку
        // т.к при вводе числа в консоль вводится ещё и '\n'
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        int findCount = 0;
        String lastFind = null;
        for (String string : strings) {
            if (isOnlyDigits(string) && isPalindrome(string)) {
                findCount++;
                lastFind = string;
                if (findCount == 2) {
                    break;
                }
            }
        }
        System.out.println(lastFind);
    }

    public static boolean isOnlyDigits(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
