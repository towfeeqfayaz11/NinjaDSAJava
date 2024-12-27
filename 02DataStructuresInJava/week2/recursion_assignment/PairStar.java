/*

*/
public class PairStar {
    // Return the updated string
	public static String addStars(String s) {
		// Write your code here
		// basecase
		if(s.length() <= 1)
			return s;
		
		// induction hypothesis
		String smallOutput = addStars(s.substring(1));
		
		// induction step
		String output;
		if(s.charAt(0) == smallOutput.charAt(0)){
			output = s.charAt(0) + "*" + smallOutput;
		}else{
			output = s.charAt(0) + smallOutput;
		}

		return output;

	}
}
