package DSA_java.Arrays;

import java.util.*;

public class SpanOfArray
{

    static void read_array(int[] arr, int length)
    {
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < length; ++index)
            arr[index] = sc.nextInt();

        sc.close();
    }


    static int get_max(int[] arr, int length)
    {
        int max = arr[0];

        for (int index = 1; index < length; ++index)
        {
            if (arr[index] > max)
                max = arr[index];
        }

        return max;
    }


    static int get_min(int[] arr, int length)
    {
        int min = arr[0];

        for (int index = 1; index < length; ++index)
        {
            if (arr[index] < min)
                min = arr[index];
        }

        return min;
    }


    static int get_span(int max, int min)
    {
        int sum_max_min = max + min;
        max = Math.max(max, min);
        min = sum_max_min - max;

        return (max - min);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Length of array: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Enter the elements:");
        read_array(array, length);

        int max = get_max(array, length);
        int min = get_min(array, length);
        int span = get_span(max, min);

        System.out.println("Span of the array: " + span);
        sc.close();
    }
}
