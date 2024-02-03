
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		String get ="";
		String gender = "";
		String toP ="";
		int fate =0;
		int i=0;
		int len =0;
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
		while (len < get.length())
		{
		  toP = toP + get.charAt(len)+" ";
		  len++;
		}
		System.out.println(toP);
		System.out.println("You made it... and now you have "+i+" children");
 
	}
}
