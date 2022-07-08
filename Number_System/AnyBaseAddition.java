 package DSA_java.Number_System;

import java.util.*;

public class AnyBaseAddition
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.printf("Number 1: ");
        int num1 = sc.nextInt();

        System.out.printf("Number 2: ");
        int num2 = sc.nextInt();

        System.out.printf("Base: ");
        int base = sc.nextInt();

        int result = add_any_base(num1, num2, base);
        System.out.println("Result: " + result);
    }

    static int add_any_base (int num1, int num2, int base)
    {
        int result = 0;
        int carry_over = 0;
        int exp = 0;

        while ((Math.max(num1, num2)) > 0)
        {
            int last_digit_num1 = num1 % 10;
            num1 /= 10;

            int last_digit_num2 = num2 % 10;
            num2 /= 10;

            int sum_last_digits = (last_digit_num1 + last_digit_num2) + carry_over;
            carry_over = sum_last_digits / base;
            sum_last_digits = sum_last_digits % base;

            result = (int)(Math.pow(10, exp++)) * sum_last_digits + result;
        }

        if (carry_over > 0)
            result = (int)(Math.pow(10, exp)) * carry_over + result;

        return result;
    }
}
