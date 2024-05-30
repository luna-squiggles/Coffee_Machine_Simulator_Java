import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {

        //duplicate array
        int[] arrCopy = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < steps; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    arr[j] = arrCopy[arr.length-1];
                } else {
                    arr[j] = arrCopy[j-1];
                }
            }
            arrCopy = Arrays.copyOf(arr, arr.length);
        }

    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}