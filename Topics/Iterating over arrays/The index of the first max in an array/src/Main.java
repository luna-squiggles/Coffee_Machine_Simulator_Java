import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //scanner
        Scanner s = new Scanner(System.in);

        //variables
        int arrLen = s.nextInt(); //array length
        int[] arr = new int[arrLen]; //initialise array
        for (int j = 0; j < arr.length; j++) {arr[j] = s.nextInt();} //populate array
        int maxVal = 0;
        int maxIndex = 0;

        //close scanner
        s.close();

        //System.out.println(Arrays.toString(arr));

        //logic
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxIndex = i;
                maxVal = arr[i];
            }
        }

        //output
        System.out.println(maxIndex);

    }
}