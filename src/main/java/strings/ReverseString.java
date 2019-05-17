package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReverseString
{

    public static void main(String[] args)
    {
        int[] array = {3, 2, 3};

    }

    public static void reverseString(char[] s)
    {
        int start = 0;
        int end = s.length - 1;

        while (start < end)
        {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
}
