package rup.algorithms;

public class RadixSort implements Algorithm{
    @Override
    public void algorithm(int[] unsortedList) {
        int radix = 8; 
        int[] count = new int[radix];

        for (int i = 0; i < unsortedList.length; i++) {
            int digit = unsortedList[i] / radix;
            count[digit]++;
        }

        for (int i = 1; i < radix; i++) {
            count[i] += count[i - 1];
        }

        int[] temp = new int[unsortedList.length];

        for (int i = unsortedList.length - 1; i >= 0; i--) {
            int digit = unsortedList[i] / radix;
            temp[count[digit] - 1] = unsortedList[i];
            count[digit]--;
        }

        for (int i = 0; i < unsortedList.length; i++) {
            unsortedList[i] = temp[i];
        }
    }
}
