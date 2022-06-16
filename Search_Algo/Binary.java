package Search_Algo;
import java.util.*;

class Binary
{
    /**
     * function to perform bubble sort
     * @param array
     * @param indices
     * @param len
     */
    static void bubble_sort(int array[], int indices[], int len)
    {
        for(int i = 0; i < (len - 1); ++i)
            for(int j = 0; j < ((len - i) - 1); ++j)
            {
                if(array[j] > array[j + 1])
                {
                    // swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // swap the indices
                    temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
    }

    /**
     * function to perform binary search in a given array
     * returns the index of the search element
     * returns -1 if element not found
     * @param array
     * @param len
     * @param ele
     * @return index of search element
     */
    static int search(int array[], int len, int ele)
    {
        int low = 0, high = (len - 1);
        
        while(high >= low)
        {
            int mid = (low + high)/2;

            if(array[mid] == ele)
                return mid;

            else if (array[mid] > ele)
                high = mid - 1;
            
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Length of array: ");
        int len = sc.nextInt();
        int array[] = new int[len];
        int indices[] = new int[len];   // array of indices of the elements

        System.out.println("Enter " + len + " elements:");
        for(int index = 0; index < len; ++index)
        {
            array[index] = sc.nextInt();
            indices[index] = index;
        }
            
        System.out.printf("Search element: ");
        int ele = sc.nextInt();

        bubble_sort(array, indices, len);
        int index = search(array, len, ele);
        
        if(index != -1)
            System.out.println(ele + " found at position " + (indices[index] + 1));
        else
            System.out.println(ele + " not found!");

        sc.close();
        // return 0;
    }
}