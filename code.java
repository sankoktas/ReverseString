/**This program writes user's input in the reverse order.
 * @author (Fikri San Koktas)
 * @version (18 January 2021)*/
import java.util.Scanner;
public class KFS_ReverseString_Main
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String word = in.next();
        char[] charArray = word.toCharArray(); // converting string to character
        for (int i = word.length() - 1; i >= 0; i--) 
        {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }
}
