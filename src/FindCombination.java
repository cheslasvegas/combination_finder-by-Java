import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class FindCombination {
    public static char[] CharArray = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k',
            'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '_', '-', '[', ']', '<', '>'};

    public static void main(String[] args) {
        String password;
        Scanner in = new Scanner(System.in);
        password = in.next();
        FindCombination(password);

    }

    public static void FindCombination(String pass) {
        String result = "";
        int count = 0;
        Random rand = new Random();

        int[] randnumbers = new int[pass.length()];
        Date beginDate = new Date();
        long beginTime = beginDate.getTime();

        do {
            for (int i = 0; i < randnumbers.length; i++) {
                int numb = rand.nextInt(CharArray.length);
                randnumbers[i] = numb;
            }
            result = getResultStr(randnumbers);
            if ((count % 1000) > 0) System.out.print(result + " ");
            else if
                    (((count % 1000) == 0) && (count != 0)) System.out.println(result);
            count++;
        } while (!result.equals(pass));
        System.out.println("\nFound!!! " + result);
        Date EndDate = new Date();
        System.out.println("Time elapsed: " + (EndDate.getTime() - beginTime));


    }

    static String getResultStr(int[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res = res.concat(String.valueOf(CharArray[arr[i]]));
        }
        return res;
    }
}
