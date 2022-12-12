import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
  public static void main(String[] args) {

    String[] names = {"Pieka Grobbelaar is a software Engineer and CEO of DrakkenTech",
     "Siyabonga Sishi is a final-year software engineering student looking for an internship with the possibility of full-time employment with Drakkentech.", 
     "WeThinkCode is in partnership with DrakkenTech helping student reach their goals in software engineering journey"};
    
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
      writer.write("Writing to a file.");
      writer.write("\nSummary between Pieka,Siya,WethinkCode and DrakkenTech:");
      
      for (String name : names) {
        writer.write("\n" + name);
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
      String line;
      while((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
