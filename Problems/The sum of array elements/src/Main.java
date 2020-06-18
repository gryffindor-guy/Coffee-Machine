import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}