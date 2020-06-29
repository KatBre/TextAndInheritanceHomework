package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type me your text line...");
        String input = scanner.nextLine();
        long dots = input.chars().filter(ch -> ch == '.').count();
        long commas = input.chars().filter(ch -> ch == ',').count();
        System.out.println("There are " + dots + " dots in your text line. :)");
        System.out.println("There are " + commas + " commas in your text line. :)");
    }
}
