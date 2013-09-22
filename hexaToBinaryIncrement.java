import java.util.ArrayList;
import java.util.List;
/*
 * Taking Hexadecimal as String,converting to binary  and ADD 1 to its binary value ,thereafter return decimal value.
 */
public class hexaToBinaryIncrement {
	public static void main(String args[]) {
		String hexaDecimal = "ab";
		char[] charSet = new char[hexaDecimal.length()]; 
		hexaDecimal.getChars(0, hexaDecimal.length(), charSet, 0);
		List<Integer> intgerList = new ArrayList<Integer>();
		List<Integer> decimalIntegerList = new ArrayList<Integer>();
		for(char d : charSet){
			switch(d){
			case 'A':
			case 'a':
				intgerList.add(10);
				break;
			case 'B':
			case 'b':
				intgerList.add(11);
				break;
			case 'C':
			case 'c':
				intgerList.add(12);
				break;
			case 'D':
			case 'd':
				intgerList.add(13);
				break;
			case 'E':
			case 'e':
				intgerList.add(14);
				break;
			case 'F':
			case 'f':
				intgerList.add(15);
				break;
			case '1':
				intgerList.add(1);
				break;
			case '2':
				intgerList.add(2);
				break;
			case '3':
				intgerList.add(3);
				break;
			case '4':
				intgerList.add(4);
				break;
			case '5':
				intgerList.add(5);
				break;
			case '6':
				intgerList.add(6);
				break;
			case '7':
				intgerList.add(7);
				break;
			case '8':
				intgerList.add(8);
				break;
			case '9':
				intgerList.add(9);
				break;
			default : break;
			}
		}
		for(Integer number : intgerList) {
			while((number >= 1)) {
				int count = number%2;
				decimalIntegerList.add(count);
				number = number/2;
			}
		}
		int carry = 0; 
		int count1 = 0;
		while(count1 <= decimalIntegerList.size()) {
			if ((count1 == decimalIntegerList.size()) &&(carry == 1)) {
				decimalIntegerList.add(0, 1);
			} else {
				if (decimalIntegerList.get(count1) == 0) {
					decimalIntegerList.set(count1,1);
					break;
				} else {
					decimalIntegerList.set(count1,0);
					carry = 1;
				}
			}
			count1++;
		}
		long number = 0;
		for (int count = 0; count < decimalIntegerList.size() ; count++) {
			number += (long)(decimalIntegerList.get(count) * Math.pow(2,count));
		}  
		System.out.println(number);
	}
}
