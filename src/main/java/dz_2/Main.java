package dz_2;
public class Main
{
    public static boolean isPalindrome(String str)
    {
        if (str == null) {
            return false;
        }

        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
        {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args)
    {
        String str = "шалаш";

        if (isPalindrome(str)) {
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не Палиндром");
        }
    }
}