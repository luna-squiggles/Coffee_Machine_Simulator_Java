import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //scanner
        Scanner scanner = new Scanner(System.in);

        //variables
        int[] arr = new int[scanner.nextInt()];
        for (int j = 0; j < arr.length; j++) {arr[j] = scanner.nextInt();}
        int largeProduct = 0;

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] * arr[i+1] > largeProduct) {
                largeProduct = arr[i] * arr[i+1];
            }
        }

        System.out.println(largeProduct);
    }
}