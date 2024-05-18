package Assignment9;
import java.io.*;

/**
 *  This program makes an encrypted copy of the file
 *  "MyLetters.txt". The encrypted copy is stored
 *  in "Encrypted.txt".
 */

public class FileEncryptionFilter
{
   public static void main(String[] args)
   {
      System.out.println("Encrypting the contents of the file");
      System.out.println("MyLetters.txt. The encrypted file will");
      System.out.println("be stored as Encrypted.txt");
      

      try
      {     
    	 Eric_Pettersson_Crypto.encryptFile("src/Assignment9/MyLetters.txt", "Encrypted.txt");
         System.out.println("Done. Use Notepad to inspect the encrypted file.");
    	 Eric_Pettersson_Crypto.decrpytFile( "Encrypted.txt", "Output.txt");

         
      }
      catch (IOException e)
      {
         System.out.println("Error - " + e.getMessage());
      }
   }
}
