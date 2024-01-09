package rup.algorithms;

public class InsertionSort implements Algorithm {
    public void algorithm(int[] unsortedList) {
        for (int i = 1; i < unsortedList.length; i++) {
            int key = unsortedList[i];
            int j = i - 1;

            while (j >= 0 && unsortedList[j] > key) {
                unsortedList[j + 1] = unsortedList[j];
                j--;
            }
            unsortedList[j + 1] = key;
        }
    }
}
