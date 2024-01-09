package rup.algorithms;

public class SelectionSort implements Algorithm{
    @Override
    public void algorithm(int[] unsortedList) {

        int smallest;
        for (int i = 0; i < unsortedList.length - 1; i++)
        {
            smallest = i;
            for (int j = i + 1; j < unsortedList.length; j++)
            {
                if (unsortedList[j] < unsortedList[smallest])
                {
                    smallest = j;

                    int temp = unsortedList[i];
                    unsortedList[i] = unsortedList[smallest];
                    unsortedList[smallest] = temp;
                }
            }
        }
    }
}
