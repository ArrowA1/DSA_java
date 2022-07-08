 package DSA_java.Number_System;

import java.util.*;

public class BaseConversion
{

    static int convert_to_base(int num, int current_base, int target_base)
    {
        int result = 0;
        int exp = 0;

        while (num > 0)
        {
            int remainder = num % target_base;
            num /= target_base;
            result += (remainder * (int)Math.pow(current_base, exp++));
        }
        return result;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int result;

        System.out.printf("Number: ");
        int num = sc.nextInt();

        System.out.printf("Current Base:");
        int current_base = sc.nextInt();

        System.out.printf("Target Base:");
        int target_base = sc.nextInt();

        if (current_base == 10 || target_base == 10)
            result = convert_to_base(num, current_base, target_base);

        else
        {
            result = convert_to_base(num, current_base, 10);
            result = convert_to_base(result, 10, target_base);
        }

        System.out.println("Result: " + result);
    }
}
