/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
        int sum = 0;
        int i = 0;
        int j = 0;
        int check = 1;
        String s = "";
        String x = "";
        while (i<=n && check !=n)
        {
            if (n%check == 0)
            {
            sum = sum +check;
            s = s + check + " + ";
            }
            i++;
            check++;
        }
        while (j<s.length()-2)
        {
            x = x + s.charAt(j);
            j++;
        }
        if (sum == n)
        System.out.println(n+ " is a perfect number since "+n+" = "+x);
        else
        System.out.println(n+" is not a perfect number");
	}
}
