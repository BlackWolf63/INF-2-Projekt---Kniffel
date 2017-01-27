import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterGameSheet {
  
	FileWriter writer;
	File file;
	
	String name;
	public int totalScore;	
	
	public int einserScore;
	public int zweierScore;
	public int	dreierScore;
	public int	viererScore;
	public int	funferScore;
	public int	sechserScore;
	public int	pDreiScore;
	public int	pVierScore;
	public int	fullHouseScore;
	public int	kleineStrasseScore;
	public int	grosseStrasseScore;
	public int	kniffelScore;
	public int	chanceScore;
	
	public int fristHalfScore;
  

  
  public void schreiben(String argName, int argEinserScore, int argZweierScore, int argDreierScore, int argViererScore, int argFunferScore, int argSechserScore, int argPDreiScore, int argPVierScore, int argFullHouseScore, int argKleineStrasseScore, int argGrosseStrasseScore, int argKniffelScore, int argChanceScore, int argTotalScore){
	name = argName;
	einserScore = argEinserScore;
	zweierScore = argZweierScore;
	dreierScore = argDreierScore;
	viererScore = argViererScore;
	funferScore = argFunferScore;
	sechserScore = argSechserScore;
	pDreiScore = argPDreiScore;
	pVierScore = argPVierScore;
	fullHouseScore = argFullHouseScore;
	kleineStrasseScore = argKleineStrasseScore;
	grosseStrasseScore = argGrosseStrasseScore;
	kniffelScore = argKniffelScore;
	chanceScore = argChanceScore;
	totalScore = argTotalScore;
	
     file = new File("FileWriterGameSheet.html");
     try {
       writer = new FileWriter(file);
	   
       writer.write("<!doctype html>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<html lang=de>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<head>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<meta charset=utf-8>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<title>Spielzettel</title> ");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</head>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<body>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<main>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<h1>Spielzettel Kniffel</h1>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<table>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<thead>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<th>Kategorie</th><th>Beschreibung</th><th>Punkte von " + name + "</th>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</thead>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<tbody>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Einser</td><td>Nur Einser</td><td>"+ einserScore + "</td>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Zweier</td><td>Nur Zweier</td><td>" + zweierScore + "</td>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Dreier</td><td>Nur Dreier</td><td>" + dreierScore + "</td>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Vierer</td><td>Nur Vierer</td><td>" + viererScore + "</td>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Fuenfer</td><td>Nur Fuenfer</td><td>" + funferScore + "</td>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Sechser</td><td>Nur Sechser</td><td>" + sechserScore + "</td>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
	   writer.write(System.getProperty("line.separator"));
	   //writer.write("<tr>");
       //writer.write(System.getProperty("line.separator"));
	   //writer.write("<td>Bonus</td><td>Ab 63 Punkten</td><td>" +  + "</td>");
	   //writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Dreierpasch</td><td>Alle Augen</td><td>" + pDreiScore + "</td>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Viererpasch</td><td>Alle Augen</td><td>" + pVierScore + "</td>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Full House</td><td>25 Punkte</td><td>" + fullHouseScore + "</td>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Kleine Strasse</td><td>30 Punkte</td><td>" + kleineStrasseScore + "</td>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Grosse Strasse</td><td>40 Punkte</td><td>" + grosseStrasseScore + "</td>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Kniffel</td><td>50 Punkte</td><td>" + kniffelScore + "</td>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Chance</td><td>Alle Augen</td><td>" + chanceScore + "</td>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("<tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("<td>Gesamtpunktzahl</td><td>Alle Punkte</td><td>" + totalScore + "</td>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</tr>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</tbody>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</table>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</main>");
	   writer.write(System.getProperty("line.separator"));
	   writer.write("</body>");
       writer.write(System.getProperty("line.separator"));
	   writer.write("</html>");
       
       
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