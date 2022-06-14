import java.util.*;

class Linear_Search
{
    /**
     * function to perform linear search
     * @param array - target array
     * @param len - length og the array
     * @param ele - search element
     * @return index of search element, if found
     * else return -1
     */
    static int linear_srch(int array[], int len, int ele)
    {
        for(int index = 0; index < len; ++index)
            if(array[index] == ele)
                return index;

        return -1;
    }

    /**
     * main function
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Length of array: ");
        int len = sc.nextInt();

        int array[] = new int[len];
        System.out.println("Enter " + len + " elements:");
        for(int index = 0; index < len; ++index)
            array[index] = sc.nextInt();
        
        System.out.printf("Search element: ");
        int ele = sc.nextInt();

        int index = linear_srch(array, len, ele);
        if(index != -1)       // element found
            System.out.println(ele + " found at index " + index);
        else
            System.out.println(ele + " not found!");

        sc.close();
    }
}