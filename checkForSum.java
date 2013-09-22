import java.util.ArrayList;
import java.util.List;
/*
 * Take even number of Integer as String,Divide them in half and check sum of both part for equality
 */
public class checkForSum {
	public static void main(String args[]){
		String number = "123123";
		List<Integer> integerList = new ArrayList<Integer>();
		for (int count = 0; count < number.length() ; count++) {
			integerList.add(Integer.parseInt("" + number.charAt(count)));
		}
		int sum1 = 0, sum2 = 0;
		for (int count = 0 ; count < integerList.size() ; count++) {
			if (count <  integerList.size()/2) {
				sum1 += integerList.get(count);
			} else {
				sum2 += integerList.get(count);
			}
		}
		if (sum1 == sum2) {
			System.out.println("sum are Equal"); 
		} else {
			System.out.println("sum are not Equal");
		}
	} 
}
