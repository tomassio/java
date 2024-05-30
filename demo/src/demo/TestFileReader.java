package demo;

//Checked Exception (IOException)
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
 public static void main(String[] args) {
     try {
         String s = "C:\\meinedatei\\projects\\excel";
         s = s.concat("\\Länderliste(1).csv");
         // Creates an array of character
         char[] array = new char[20000];         
         File file = new File(s);
         FileReader reader = new FileReader(file);
         // Reads characters
         reader.read(array);
         System.out.println("Data in the file: ");
         System.out.println(array);
         reader.close();
     } catch (IOException e) {
         // Handle the checked exception
         System.err.println("An IOException occurred: " + e.getMessage());
     }
 }
}