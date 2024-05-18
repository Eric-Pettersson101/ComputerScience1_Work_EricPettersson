package Assignment9;
import java.io.*;

public class Eric_Pettersson_Crypto {

    public static void encryptFile(String inputFile, String outputFile) throws IOException {
        DataInputStream inFile = new DataInputStream(new FileInputStream(inputFile));
        DataOutputStream outFile = new DataOutputStream(new FileOutputStream(outputFile));
        try {
            byte c;
            while (true) {
                c = inFile.readByte(); //Gets the next byte
                c += 15; // Encrypt the byte by adding 15 to its value.
                outFile.writeByte(c); // Write the encrypted byte to the output file.
               
               
               
            }     
      } catch (Exception e) {
      outFile.close();
      inFile.close();
      }
    }
    
    public static void decrpytFile(String inputFile, String outputFile) throws IOException {
        DataInputStream inFile = new DataInputStream(new FileInputStream(inputFile));
        DataOutputStream outFile = new DataOutputStream(new FileOutputStream(outputFile));
        try {
            byte c;
            while (true) {
                c = inFile.readByte(); //Gets the next byte
                c -= 15; // Encrypt the byte by adding 15 to its value.
                outFile.writeByte(c); // Write the encrypted byte to the output file.
               
               
               
            }     
      } catch (Exception e) {
      outFile.close();
      inFile.close();
      }
    }
}
