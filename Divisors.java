/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num, divisor;
        num = Integer.parseInt(args[0]);
        divisor = Integer.parseInt(args[1]);
        while (num+1 != divisor)
        {
            if (num%divisor == 0)
            System.out.println(divisor);
            divisor++;
	}
}
}
