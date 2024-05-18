import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Eric_Pettersson_Check_Writer {
    private static String numberToWords(int num) {
        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (num < 20) {
            return units[num];
        }
        if (num < 100) {
            return tens[num / 10] + (num % 10 != 0 ? " " : "") + units[num % 10];
        }
        if (num < 1000) {
            return units[num / 100] + " Hundred" + (num % 100 != 0 ? " " : "") + numberToWords(num % 100);
        }
        return units[num / 1000] + " Thousand" + (num % 1000 != 0 ? " " : "") + numberToWords(num % 1000);
    }

    private static boolean isValidDate(String dateString) {
        String[] parts = dateString.split("/");
        if (parts.length != 3) return false;

        if (parts[0].length() != 2 || parts[1].length() != 2 || parts[2].length() != 4) return false;

        try {
            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if (month < 1 || month > 12) return false;
            if (day < 1 || day > 31) return false;
            if (year < 1000 || year > 9999) return false;
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
    	try {
    	        DecimalFormat df = new DecimalFormat("#,###.00");

    	        System.out.println("Enter the date (mm/dd/yyyy): ");
    	        String date = input.nextLine();

    	        System.out.println("Enter the payee's name: ");
    	        String name = input.nextLine();

    	        System.out.println("Enter the amount of the check: ");
    	        double amount = input.nextDouble();

    	        System.out.println("Do you want to preview the check format? (YES/NO)");
    	        String previewOption = input.next();

    	        int dollarPart = (int) amount;
    	        int centPart = (int) ((amount - dollarPart) * 100);

    	        String amountInWords = numberToWords(dollarPart) + " and " + centPart + " cents";
    	        if(isValidDate(date)) {
        	        String outputFileName = "Eric_Pettersson_Output.txt";
        	        String content = "Date: " + date + "\n" +
        	                "Pay to the order of: " + name + " $" + df.format(amount) + "\n" +
        	                amountInWords + "\n";

        	        if (previewOption.equalsIgnoreCase("YES")) {
        	            content += "Note: Printed with preview.";
        	            System.out.println(content);
        	        }
        	        
        	        try (FileWriter writer = new FileWriter(outputFileName)) {
        	            writer.write(content);
        	            writer.close();
        	        } catch (IOException e) {
        	            System.out.println("An error occurred while writing to file: " + e.getMessage());
        	        }
    	        }
    	        else {
    	        	System.out.println("Invalid DATE!");
    	        }

    	    } catch (Exception e) {
	            System.out.println("An error occurred while writing to file: " + e.getMessage());
	        }
        input.close();
        
    	}
}
