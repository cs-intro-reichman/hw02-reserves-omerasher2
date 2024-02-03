/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = "";
        String empty = "";
        String mid = "";
        char keep;
        int len = s.length() - 1;
        int i = s.length() - 1;
        while (i != 0)
        {
            if (i == len/2)
            mid =  mid+  s.charAt(i);
            keep = s.charAt(i);
            empty = empty + keep;
            i--;
        }
        empty = empty + s.charAt(0);
        System.out.println(empty);
        System.out.println("the middle character is "+ mid);
	}
}
