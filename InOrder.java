/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int ran = 0;
        int keep =0;
        boolean stop = true;
        while (stop == true)
        {
            ran = (int) (Math.random()*(11)); 
            if (ran>=keep)
            {
            System.out.print(ran+ " ");
            keep = ran;
            }
            else
            stop = false;	
	 }
}
}

