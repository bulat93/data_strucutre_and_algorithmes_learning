package strings;

import java.util.Arrays;

public class ReverseStringByRecursion
{
    /*public static void main(String[] args)
    {
        char[] a = {'h', 'e', 'l', 'l', 'o', 'w', 'l', 'k'};
        reverseString(a);
        System.out.println(a);
    }

    private static void reverseString(char[] s)
    {
        int start = 0;
        int end = s.length - 1;

        reverse(start, end, s);
    }

    private static void reverse(int start, int end, char[] s)
    {
        if (start >= end) {
            return;
        }
        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;
        start++;
        end--;
        reverse(start, end, s);
    }*/

    public static void main(String[] args)
    {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x)
    {
        String value = String.valueOf(x);

        return check(value);

    }

    private static boolean check(String value)
    {
        if (value.length() == 1)
            return true;
        if (value.startsWith("-") || value.startsWith("0"))
            return false;
        if (value.endsWith("0"))
            return false;

        char[] array = value.toCharArray();
        String result = reverseString(array);

        return value.equals(result);
    }

    private static String reverseString(char[] s)
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

        return String.copyValueOf(s);
    }
}
