import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); //эта строка нужна чтобы пропустить символ перехода на новую строку
        // т.к при вводе числа в консоль вводится ещё и '\n'
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        String mostUnique = strings[0];
        for (String string : strings) {
            if (countUnique(mostUnique) < countUnique(string)) {
                mostUnique = string;
            }
        }
        System.out.println(mostUnique);
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
