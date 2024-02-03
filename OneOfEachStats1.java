/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int v = Integer.parseInt(args[0]);
		int times =0;
		int count2=0, count3=0, count4=0;
		double sum =0;
		while (times < v)
		{
			String get ="";
			String gender = "";
			int fate =0;
			int i=0;
			fate = (int) (Math.random()*(2));
			if (fate == 0)
			get = get + "g";
			else
			get = get + "b";
			fate =0;
			boolean stop = true;
			while (stop == true)
			{
				fate = (int) (Math.random()*(2));
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

