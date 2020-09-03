
public class StringManipulator {
	
	char charArray[]; //the original string will be split into characters. Those characters make up this array. 
	char reversedArray[]; //charArray in reverse. I will concatenate the elements in this array to create 
	char characterArray[];
	char charArray2[];
	char reverseArray[];
	char reverseArray2[];
	String reverse = ""; 
	
	public static void main(String[] args) {
		StringManipulator s = new StringManipulator();
		System.out.println(s.numberofWords("The Lannisters send their regards, and the North remembers.")); 
	}
	
	//Method will reverse the provided string
	public String reverse(String str) {
		charArray = str.toCharArray();
		reversedArray = new char[charArray.length];
		int index = 0;
		for(int i = charArray.length - 1; i >= 0; i--) { //For loop starting from the last character, going backwards to the first character.
			reversedArray[index] = charArray[i]; //every iteration from charArray goes from back to front, as it fills reversedArray from front to end.
			index++;
		}
		for(int i = 0; i < reversedArray.length; i++) {
			reverse += reversedArray[i]; //concatenating via += because you have to keep each change to the String reverse while adding to it.
		}
		return reverse;
}
	//Method will detect if provided string is a palindrome
	
	public boolean isPalindrome(String str) {
		characterArray = str.toCharArray();
		reverseArray = new char[characterArray.length];
		int index = 0;
		int index2 = characterArray.length-1;
		int counter = 0;
		for(int i = characterArray.length - 1; i >= 0; i--) { //for loop that fills reverseArray with the charArray's contents - but in reverse order
			reverseArray[index] = characterArray[i];
			index++;
		}
 		for(int k = reverseArray.length - 1; k >= 0; k--) { //for loop comparing both arrays from their back to the end. If they're identical from back to end, they're palindromes 
 			if(characterArray[index2] == reverseArray[k]) {
 				counter++;
 				index2--;
 			}
 			}
		if(counter == characterArray.length) {
			return true;
		} 
		return false;
	}
	
	//method checking for duplicate characters. The last 2 methods are self-explanatory
	public boolean duplicateChars(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public int numberofVowels(String str) {
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
	
	public int numberofWords(String str) {
		int count = 0;
		if(str.length() > 1) {
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			} 
			}
		count = count + 1;
		return count;
	}
		return count;
		}
}
