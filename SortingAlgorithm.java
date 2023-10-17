import java.util.*;

public class SortingAlgorithm {

    public static void main(String[] args) {
        random_test();
    }

    //sorts an array in ascending order
    public static void sort(int[] a) {
        for (int i = 0;i<a.length;i++) {
            for (int j = 0;j<a.length-i-1;j++) {
                if (a[j]>a[j+1]) {
                    //if we were to add a mutation and change >  to <
                    // running the random_test would result in all failed test cases
                    //if (a[j]<a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    //prints all the values in an array
    public static  void printArray(int[] a) {
        for(int i = 0; i<a.length; i++) {
            System.out.print(a[i] + " ");;
        }
        System.out.println();
    }

    //produces an array of a random length and assign values to every index of the array
    public static int[] array_generator() {
        Random r = new Random();
        int arrayLen = r.nextInt(30); //lengths between 0to29
        int[] a = new int[arrayLen];
        for (int i = 0; i<arrayLen; i++) {
            a[i] = r.nextInt(1001); //int assigned to the array index is between 0to1000
        }
        return a;
    }

    //conducts 10 tests for the sort function with 10 randomly generated test cases
    public static void random_test() {
        for (int i = 0; i<=10; i++) {
            int[] a = array_generator();
            System.out.print("Input is ");
            printArray(a);
            sort(a);
            System.out.print("Output is ");
            printArray(a);

            boolean order=true;
            for (int j=0; j<a.length-1; j++) {
                if (a[j] > a[j+1]) {
                    System.out.println("Test Failed");
                    order = false;
                    break;
                }
            }
            if (order) {
                System.out.println("Test Passed");
            }
            System.out.println();
        }
    }
}
