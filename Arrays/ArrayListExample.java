package DSA_java.Arrays;

import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; ++i)
        {
            ArrayList<Integer> sub_list = new ArrayList<>();

            for (int j = 0; j < 3; ++j)
                sub_list.add(j);

            list.add(sub_list);
        }

        for (ArrayList<Integer> ele : list)
            System.out.println(ele);
    }
}
