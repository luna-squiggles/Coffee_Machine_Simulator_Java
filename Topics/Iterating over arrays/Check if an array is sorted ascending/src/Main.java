import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //initialise scanner
        Scanner scanner = new Scanner(System.in);

        //obtain variables
        int arrLength = scanner.nextInt(); //array length
        int[] array = new int[arrLength]; //initialise array
        boolean ordered = true; //assume sorted

        //populate array
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] > array[j + 1]) {
                ordered = false;
                break;
            }
        }

        //print result
        System.out.println(ordered);
    }
}