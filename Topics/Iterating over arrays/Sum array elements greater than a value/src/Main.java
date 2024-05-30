import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //scanner
        Scanner scanner = new Scanner(System.in);

        //variables
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int sum = 0;

        //populate array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //variables continued
        int n = scanner.nextInt();

        //close scanner
        scanner.close();

        //logic
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > n) {
                sum += arr[j];
            }
        }

        //print output
        System.out.println(sum);
    }
}