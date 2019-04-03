package Methodmad;

public class Methods {
    public static int sumUpto(int Integer)
    {
        int sum = 0;
        for(int i = 0; i <= Integer;i++)
        {
            sum = sum + i;
        }
        return sum;
    }
    public static String multiplicationTable(int base, int range)
    {
        String end = "the end";
        for(int i = 0; i <= range;i++)
        {
           int product = base * i;
           System.out.println(product);
        }
        return end;
    }
    public static String dateStr(String mdy)
    {
        String partA = mdy.substring(0,2);
        String partB = mdy.substring(3,5);
        String partC = mdy.substring(6);
        return partB + "-" + partA + "-" + partC;
    }
    public static boolean isPalindrome(String str)
    {
        String str2 = "";
        str = str.toLowerCase();
        for(int i = str.length() - 1; i > -1; i--)
        {
            str2 += str.substring(i, i + 1);
        }
        if (str.equals(str2))
            return true;
        return false;
    }

}
