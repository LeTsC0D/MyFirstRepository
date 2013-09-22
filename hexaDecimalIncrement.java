import java.util.ArrayList;
import java.util.List;
/*
 * Taking Hexadecimal as string and increment it by 1 and return value in hexadecimal format
 */
public class hexaDecimalIncrement {
	public static void main(String args[]){
		String hexaDecimal = "FF";
		List<Character> characterSet = new ArrayList<Character>(); 
		for(int count = 0;count < hexaDecimal.length();count++){
			characterSet.add(hexaDecimal.charAt(count));
		}
		int countNoOfCharacter = characterSet.size();
		int carry = 0;
		while(countNoOfCharacter >= 0) { 
			if ((countNoOfCharacter == 0) && (carry == 1)) {
				characterSet.add(0,'1');
			} else if (countNoOfCharacter != 0){
				carry = 0;
				if (characterSet.get(countNoOfCharacter - 1).toString().equalsIgnoreCase("a")) {
					characterSet.set(countNoOfCharacter - 1, 'b');
				} else 	if (characterSet.get(countNoOfCharacter - 1).toString().equalsIgnoreCase("b")) {
					characterSet.set(countNoOfCharacter - 1, 'c');
				} else 	if (characterSet.get(countNoOfCharacter - 1).toString().equalsIgnoreCase("c")) {
					characterSet.set(countNoOfCharacter - 1, 'd');
				} else 	if (characterSet.get(countNoOfCharacter - 1).toString().equalsIgnoreCase("d")) {
					characterSet.set(countNoOfCharacter - 1, 'e');
				} else if (characterSet.get(countNoOfCharacter - 1).toString().equalsIgnoreCase("e")) {
					characterSet.set(countNoOfCharacter - 1, 'f');
				} else if (characterSet.get(countNoOfCharacter - 1).toString().equalsIgnoreCase("f")) {
					characterSet.set(countNoOfCharacter - 1, '0');
					carry = 1;
				}
			}
			countNoOfCharacter--;
		}
		for (Character character:characterSet) {
			System.out.print(character);
		}
	} 
}
