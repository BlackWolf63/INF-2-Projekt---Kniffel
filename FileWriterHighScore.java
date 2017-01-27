import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileWriterHighScore {
  
  BufferedReader reader;
  FileWriter writer;
  File file;
  
  public void schreiben(String name, int score){
	 // File anlegen
     file = new File("Highscore.txt");
     try {
		 
		reader = new BufferedReader(new FileReader(file));
		//Erste Zeile überspringen
		reader.readLine();
		 
		String[] namen = new String[10];
		int[] scores = new int[10];
		String line;
		int i = 0;
		while((line = reader.readLine())!=null){
			namen[i] = line.split("\t\t")[0];
			scores[i] = Integer.parseInt(line.split("\t\t")[1]);
			i++;
		}
		
		reader.close();
		
		 
       // new FileWriter(file ,true) - falls die Datei bereits existiert
       // werden die Bytes an das Ende der Datei geschrieben
       
       // new FileWriter(file) - falls die Datei bereits existiert
       // wird diese überschrieben
       writer = new FileWriter(file);
       
	   
		writer.write("Name\t\tScore");
	   writer.write(System.getProperty("line.separator"));
	   
	   int length=10;
	   for(i = 0; i<length; i++){
		   if(score>scores[i] && length == 10){
				writer.write(name+"\t\t"+score);
				i--;
				length--;
		   }else{
				writer.write(namen[i]+"\t\t"+scores[i]);
		   }
			writer.write(System.getProperty("line.separator"));
	   }
	          
       // Schreibt den Stream in die Datei
       // Sollte immer am Ende ausgeführt werden, sodass der Stream 
       // leer ist und alles in der Datei steht.
       writer.flush();
       
       // Schließt den Stream
       writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}