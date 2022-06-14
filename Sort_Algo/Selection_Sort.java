package Sort_Algo;
import java.util.*;

public class Selection_Sort 
{
    /***
     * function to find index of smallest element within a set range
     * @param array - target array
     * @param start_index
     * @param end_index
     * @return index of smallest element
     */
    static int find_smol_index(int array[], int start_index, int end_index)
    {
        int smol_index = start_index;

        for(int index = (start_index + 1); index < end_index; ++index)
            if(array[index] < array[smol_index])
                smol_index = index;

        return smol_index;
    }

    /***
     * function to implement selection sort
     * @param array - target array
     * @param len - length of array
     */
    static void selection_sort(int array[], int len)
    {
        for (int index = 0; index < (len - 1); ++index)
        {
            int swap_index = find_smol_index(array, index, len);

            // swapping
            int temp = array[index];
            array[index] = array[swap_index];
            array[swap_index] = temp;
        }
    }

    /***
     * main function
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Length of array: ");
        int len = sc.nextInt();

        int array[] = new int[len];
        System.out.println("Enter " + len + " elements:");
        for (int index = 0; index < len; ++index)
            array[index] = sc.nextInt();

        System.out.println("Performing Selection Sort...");
        selection_sort(array, len);

        System.out.println("Sorted Array:");
        for (int index = 0; index < len; ++index)
            System.out.print(array[index] + " ");

        sc.close();
    }
}
