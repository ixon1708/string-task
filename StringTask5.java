import java.util.Scanner;

public class StringTask5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); //эта строка нужна чтобы пропустить символ перехода на новую строку
        // т.к при вводе числа в консоль вводится ещё и '\n'
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        String onlyUnique = null;
        for (String string : strings) {
            if (string.length() == countUnique(string)) {
                onlyUnique = string;
                break;
            }
        }
        System.out.println(onlyUnique);
    }

    public static int countUnique(String text) {
        int count = text.length();
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            int firstFound = text.indexOf(currentSymbol);
            if (firstFound != i) {
                count--;
            }
        }
        return count;
    }

}
