package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorting {
    // TODO Write a method to generate an array of size N initialised with random numbers
    public static List<Integer> generateRandomArray(int n) { // ArrayList erstellt, um User input interessanter zu gestalten
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr.add(random.nextInt(1000)); //Nachdem User die gewünschte größe des Arrays eingegeben hat, werden random Zahlen zwischen 0 und 1000
        }
        return arr;
    }
    // TODO Implement a sorting algorithm of your choice

    public static int countIteration;

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            countIteration++;
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void sort(int arr[], int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            sort(arr, low, index - 1);
            sort(arr, index + 1, high);
        }
    }


    // TODO Implement a printArray method
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
