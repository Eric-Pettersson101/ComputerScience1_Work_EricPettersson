import java.util.Scanner;
import java.util.InputMismatchException;

public class Eric_Pettersson_Palindrome {
    static String inputString;
    static int toContinue;
    
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	try {
            do {
                System.out.println("Enter a string to check for palindrome (ignore punctuation, spaces, and special characters):");
                inputString = scanner.nextLine();
                boolean isPalindrome  = palindromeDetector(inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
                if (isPalindrome) {
                    System.out.println("This is a palindrome.");
                } else {
                    System.out.println("This is NOT a palindrome.");
                }
                System.out.println("Do you want to continue? Enter 1 for yes and 0 for no");
                toContinue = scanner.nextInt();
                scanner.nextLine(); // clearing input buffer
            } while (toContinue != 0);
            System.out.println("See you later");
            
            //Exception handling 
    	}	catch(InputMismatchException missmatch) {
            System.out.println("Invaild input type");
    	}	catch(Exception e) {
              e.printStackTrace();        	 
    	}	finally {
    		scanner.close();
    	}
 }
    
        public static boolean palindromeDetector(String str) {
        	try {
                if (str.length() <= 1) {
                    return true;
                } else {
                    if (str.charAt(0) != str.charAt(str.length() - 1)) {
                        return false;
                    } else {
                        return palindromeDetector(str.substring(1, str.length() - 1));
                    }
                }
        	} catch (StackOverflowError overflow){
                System.out.println("The string is too long to process.");
                return false;
        	}
        }
    }
