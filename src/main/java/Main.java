import sort.Sorting;

import java.util.List;
import java.util.Scanner;

import static sort.Sorting.*;

public class Main {

    public static void main(String[] args) {

        // TODO Initialise an int array with random numbers
        Scanner input = new Scanner(System.in); // User gibt größer des Arrays an
        System.out.println("Enter the array size: ");
        int n = input.nextInt();

        List<Integer> randomArray = generateRandomArray(n); //die random generierten Zahlen werden in die Liste gespeichert

        //Liste wird in ein Array konvertiert
        int[] arrayToSort = new int[randomArray.size()]; //neues Array wird erstellt mit der größe der Liste
        for (int i = 0; i < randomArray.size(); i++) { //Schleife geht durch die Liste randomArray
            arrayToSort[i] = randomArray.get(i); // Für jedes Element wird der Wert an der Position i aus randomArray genommen und in das entsprechende Element des Arrays arrayToSort geschrieben

        }

        // TODO Sort the array with your sorting algorithm
        Sorting sortingObj = new Sorting();
        sortingObj.sort(arrayToSort, 0, arrayToSort.length - 1);

        // TODO Print the array to the console
        System.out.println("Sorted Array:");
        Sorting.printArray(arrayToSort);

        System.out.println("Iteration counters: "+ countIteration);


    }
}
