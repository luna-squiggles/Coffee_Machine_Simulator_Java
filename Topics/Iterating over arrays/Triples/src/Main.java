import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //initialise scanner
        Scanner scanner = new Scanner(System.in);

        //variables
        int arrLength = scanner.nextInt(); //array length
        int[] arr = new int[arrLength]; //initialise array
        for (int j = 0; j < arr.length; j++) {arr[j] = scanner.nextInt();} //populate array
        int triplets = 0; //number of triplets found
        int value; //temporary current value

        //logic
        for (int i = 0; i < arr.length-2; i++) {
            value = arr[i];
            if ((arr[i+1] == value+1) && (arr[i+2] == value+2)) {
                triplets++;
            }
        }

        System.out.println(triplets);

    }
}