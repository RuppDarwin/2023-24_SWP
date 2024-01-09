package rup.algorithms;

public class BubbleSort implements Algorithm{
    @Override
    public void algorithm(int[] unsortedList) {
        int n = unsortedList.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if (unsortedList[j - 1] > unsortedList[j]) {
                    int temp = unsortedList[j - 1];
                    unsortedList[j - 1] = unsortedList[j];
                    unsortedList[j] = temp;
                }
            }
        }

    }
}
