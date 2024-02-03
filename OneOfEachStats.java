import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		int times =0;
		int count2=0, count3=0, count4=0;
		double sum =0;
		while (times < T)
		{
			String get ="";
			String gender = "";
			int fate =0;
			int i=0;
			fate = (int) (generator.nextDouble()*2);
			if (fate == 0)
			get = get + "g";
			else
			get = get + "b";
			fate =0;
			boolean stop = true;
			while (stop == true)
			{
				fate = (int) (generator.nextDouble()*2);
				  if (fate == 0)
				  gender = "g";
				  else 
				  gender = "b";
				  if (gender.charAt(0) == get.charAt(i))
				  get = get + gender;
				  else
				  {
					 get = get + gender;
					 stop = false;
				  }
				  i++;
				  fate = 0;
				  
			}
			i++;
			sum = sum+i;
			if (i==2)
			count2++;
			else if (i==3)
			count3++;
			else
			count4++;
			times ++;
		}
		System.out.println("Average: "+sum/times+" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+count2);
		System.out.println("Number of families with 3 children: "+count3);
		System.out.println("Number of families with 4 or more children: "+count4);
		if (count2>count3 && count2>count4)
		System.out.println("the most common number of children is 2.");
		else if (count3>count2 && count3>count4)
		System.out.println("the most common number of children is 3.");
		else
		System.out.println("the most common number of children is 4 or more.");
	}
}
