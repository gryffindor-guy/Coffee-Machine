import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print(a[length - 1]);
        for (int j = 0; j < length - 1; j++) {
            System.out.print(" " + a[j]);
        }
    }
}