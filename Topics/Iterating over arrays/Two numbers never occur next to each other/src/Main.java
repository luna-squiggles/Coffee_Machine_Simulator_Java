import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //initialise scanner
        Scanner scanner = new Scanner(System.in);

        //obtain & initialise variables
        int arrayLength = scanner.nextInt(); //array length
        int[] array = new int[arrayLength]; //array
        for (int i = 0; i < array.length; i++) array[i] = scanner.nextInt(); //array values
        int n = scanner.nextInt(), m = scanner.nextInt(); //variables n and m
        boolean valuesPresent = true; //default output condition

        //logic
        for (int j = 0; j < array.length-1; j++) {
            if ((array[j] == m && (array[j+1] == n)) || (array[j] == n && (array[j+1] == m))) {
                valuesPresent = false;
                break;
            }
        }


        System.out.println(valuesPresent); //prints result

        scanner.close(); //close scanner



    }
}