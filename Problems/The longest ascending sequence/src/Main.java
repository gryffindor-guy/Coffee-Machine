import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];
        int count = 1;
        int tempCount = 1;
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                tempCount++;
            } else {
                tempCount = 1;
            }
            if (tempCount > count) {
                count = tempCount;
            }
        }
        if (length == 1) {
            System.out.println(1);
        } else {
            System.out.println(count);
        }
    }
}