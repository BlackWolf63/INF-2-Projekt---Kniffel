import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class KniffelApp {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		String textInput;
		int playerCount = 0;
		int roundCounter = 0;
		boolean correctInput = false;
		int result = 0;
		int playerFinished = 0;
		int Input = 0;
		int bestScore = 0;
		
		boolean eAllowed = false;
		boolean zAllowed = false;
		boolean dAllowed = false;
		boolean vAllowed = false;
		boolean fAllowed = false;
		boolean sAllowed = false;
		boolean pdAllowed = false;
		boolean pvAllowed = false;
		boolean hAllowed = false;
		boolean kAllowed = false;
		boolean gAllowed = false;
		boolean knAllowed = false;
		boolean cAllowed = false;
		boolean xAllowed = false;
		
		
		//Würfel
		int A;
		int B;
		int C;
		int D;
		int E;
		
		FileWriterGameSheet fileWriterGameSheet = new FileWriterGameSheet();
		
		System.out.println("\nHighscoretest?[Y/N]");
		textInput = scanner.next();
		if (textInput.equalsIgnoreCase("test")){
			FileWriterHighScore fileWriterHighScore = new FileWriterHighScore();
			System.out.println("\nName?");
			textInput = scanner.next();
			System.out.println("\nScore?");
			Input = scanner.nextInt();
			fileWriterHighScore.schreiben(textInput, Input);
			System.out.println("\nTest-Highscore gespeichert.\n");
			
		}
		
		System.out.println("Wieviele Spieler?");
		playerCount = scanner.nextInt();	

		Player[] players = new Player[playerCount];
		for(int i = 0; i < playerCount; i++){
			System.out.println("\nBitte Namen des Spielers eingeben:");
			textInput = scanner.next();
			players[i] = new Player(textInput);
		}
		
		
		//Spiel
		while (playerFinished != playerCount) {
			//Zug
			for(int i = 0; i < players.length; i++){
				
				//reset
				correctInput = false;
				result = 0;
				
				eAllowed = false;
				zAllowed = false;
				dAllowed = false;
				vAllowed = false;
				fAllowed = false;
				sAllowed = false;
				pdAllowed = false;
				pvAllowed = false;
				hAllowed = false;
				kAllowed = false;
				gAllowed = false;
				knAllowed = false;
				cAllowed = false;
				xAllowed = false;
				
				System.out.println("\nSpieler " + players[i].getName() + " ist am Zug");
				
				
				
				fileWriterGameSheet.schreiben(players[i].getName(), players[i].getEinserScore(), players[i].getZweierScore(), players[i].getDreierScore(), players[i].getViererScore(), players[i].getFünferScore(), players[i].getSechserScore(), players[i].getPDreiScore(), players[i].getPVierScore(), players[i].getFullHouseScore(), players[i].getKleineStrasseScore(), players[i].getGrosseStrasseScore(), players[i].getKniffelScore(), players[i].getChanceScore(), players[i].getTotalScore());
				
				
				A = (int) Math.ceil(Math.random() * 6);
				B = (int) Math.ceil(Math.random() * 6);
				C = (int) Math.ceil(Math.random() * 6);
				D = (int) Math.ceil(Math.random() * 6);
				E = (int) Math.ceil(Math.random() * 6);
				
				System.out.println("\n\nWuerfel:   A B C D E");
				System.out.println("\nAugenzahl: " + A + " " + B + " " + C + " " + D + " " + E);
				
				System.out.println("\n\nNochmal Wuerfeln?[Y/N]");
				
				//Würfel vorgeben (test)
				textInput = scanner.next();
				if (textInput.equalsIgnoreCase("test")){
					System.out.println("\nSpiel beenden?[q]");
					textInput = scanner.next();
					if (textInput.equalsIgnoreCase("q")) {
						playerFinished = playerCount;
					}
					System.out.println("\nA?");
					Input = scanner.nextInt();
					A = Input;
					System.out.println("\nB?");
					Input = scanner.nextInt();
					B = Input;
					System.out.println("\nC?");
					Input = scanner.nextInt();
					C = Input;
					System.out.println("\nD?");
					Input = scanner.nextInt();
					D = Input;
					System.out.println("\nE?");
					Input = scanner.nextInt();
					E = Input;
					
				}
				//Neu Würfeln
				if (textInput.equalsIgnoreCase("y")) {
					System.out.println("\nWuerfel A?[Y/N]");
					textInput = scanner.next();
					if (textInput.equalsIgnoreCase("y")) {
						A = (int) Math.ceil(Math.random() * 6);
						System.out.println("\nWuerfel A wurde neu gewuerfelt.");
					}
					System.out.println("\nWuerfel B?[Y/N]");
					textInput = scanner.next();
					if (textInput.equalsIgnoreCase("y")) {
						B = (int) Math.ceil(Math.random() * 6);
						System.out.println("\nWuerfel B wurde neu gewuerfelt.");
					}				
					System.out.println("\nWuerfel C?[Y/N]");
					textInput = scanner.next();
					if (textInput.equalsIgnoreCase("y")) {
						C = (int) Math.ceil(Math.random() * 6);
						System.out.println("\nWuerfel C wurde neu gewuerfelt.");
					}				
					System.out.println("\nWuerfel D?[Y/N]");
					textInput = scanner.next();
					if (textInput.equalsIgnoreCase("y")) {
						D = (int) Math.ceil(Math.random() * 6);
						System.out.println("\nWuerfel D wurde neu gewuerfelt.");
					}				
					System.out.println("\nWuerfel E?[Y/N]");
					textInput = scanner.next();
					if (textInput.equalsIgnoreCase("y")) {
						E = (int) Math.ceil(Math.random() * 6);
						System.out.println("\nWuerfel E wurde neu gewuerfelt.");
					}
					
					System.out.println("\n\nWuerfel:   A B C D E");
					System.out.println("\nAugenzahl: " + A + " " + B + " " + C + " " + D + " " + E);
					

					System.out.println("\n\nNochmal Wuerfeln?[Y/N]");
					textInput = scanner.next();
					
					if (textInput.equalsIgnoreCase("y")) {
						System.out.println("\nWuerfel A?[Y/N]");
						textInput = scanner.next();
						if (textInput.equalsIgnoreCase("y")) {
							A = (int) Math.ceil(Math.random() * 6);
							System.out.println("\nWuerfel A wurde neu gewuerfelt.");
						}
						System.out.println("\nWuerfel B?[Y/N]");
						textInput = scanner.next();
						if (textInput.equalsIgnoreCase("y")) {
							B = (int) Math.ceil(Math.random() * 6);
							System.out.println("\nWuerfel B wurde neu gewuerfelt.");
						}				
						System.out.println("\nWuerfel C?[Y/N]");
						textInput = scanner.next();
						if (textInput.equalsIgnoreCase("y")) {
							C = (int) Math.ceil(Math.random() * 6);
							System.out.println("\nWuerfel C wurde neu gewuerfelt.");
						}				
						System.out.println("\nWuerfel D?[Y/N]");
						textInput = scanner.next();
						if (textInput.equalsIgnoreCase("y")) {
							D = (int) Math.ceil(Math.random() * 6);
							System.out.println("\nWuerfel D wurde neu gewuerfelt.");
						}				
						System.out.println("\nWuerfel E?[Y/N]");
						textInput = scanner.next();
						if (textInput.equalsIgnoreCase("y")) {
							E = (int) Math.ceil(Math.random() * 6);
							System.out.println("\nWuerfel E wurde neu gewuerfelt.");
						}
						
						System.out.println("\n\nWuerfel:   A B C D E");
						System.out.println("\nAugenzahl: " + A + " " + B + " " + C + " " + D + " " + E);				
					}
				}
				
				
				
				System.out.println("\n\nWie soll der Wurf verwendet werden?");
				//Anzeige der Verwendungsmöglichkeiten
				if ((players[i].getEinserScore() == 0) && (A == 1 || B == 1 || C == 1 || D == 1 || E == 1)) {
					System.out.println("\nEinser?[E]");
					eAllowed = true;
				}
				
				if ((players[i].getZweierScore() == 0) && (A == 2 || B == 2 || C == 2 || D == 2 || E == 2)) {
					System.out.println("\nZweier?[Z]");
					zAllowed = true;
				}
				
				if ((players[i].getDreierScore() == 0) && (A == 3 || B == 3 || C == 3 || D == 3 || E == 3)) {
					System.out.println("\nDreier?[D]");
					dAllowed = true;
				}
				
				if ((players[i].getViererScore() == 0) && (A == 4 || B == 4 || C == 4 || D == 4 || E == 4)) {
					System.out.println("\nVierer?[V]");
					vAllowed = true;
				}
				
				if ((players[i].getFünferScore() == 0) && (A == 5 || B == 5 || C == 5 || D == 5 || E == 5)) {
					System.out.println("\nFuenfer?[F]");
					fAllowed = true;
				}
				
				if ((players[i].getSechserScore() == 0) && (A == 6 || B == 6 || C == 6 || D == 6 || E == 6)) {
					System.out.println("\nSechser?[S]");
					sAllowed = true;
				}
				
				if ((players[i].getPDreiScore() == 0) && ((A == B && B == C) || (B == C && C == D) || (C == D && D == E) || (D == E && E == A) || (E == A && A == B) || (A == C && C == D) || (A == D && D == E) || (A == B && B == D) || (A == B && B == E) || (B == C && C == E) || (B == D && D == E) || (B == C && C == D) ) ) {
					System.out.println("\nDreierpasch?[PD]");
					pdAllowed = true;
				}
				
				if ((players[i].getPVierScore() == 0) && ( (A == B && B == C  && C == D) || (B == C && C == D  && D == E) || (A == C && C == D  && D == E) || (A == B && B == C  && C == E) || (A == B && B == D  && D == E) ) ) {
					System.out.println("\nViererpasch?[PV]");
					pvAllowed = true;
				}
				
				if ((players[i].getFullHouseScore() == 0) && ((A == B && B == C && A != D && D == E) || (B == C && C == D && B != A && A == E) || (C == D && D == E && C != A && A == B) || (A == D && D == E && A != B && B == C) || (A == B && B == E && A != D && D == C) || (A == C && C == D && A != B && B == E) || (A == C && C == E && A != B && B == D) || (B == D && D == E && B != A && A == C) || (B == C && C == E && B != A && A == D) )) {
					System.out.println("\nFull House?[H]");
					hAllowed = true;
				}
								
								
								
				if ((players[i].getKleineStrasseScore() == 0) && ( (A != B && B != C  && C != D && A != C && A != D && B != D) || (B != C && C != D  && D != E && B != D && B != E && C != E) || (A != C && C != D  && D != E && A != D && A != E && C != E) || (A != B && B != C  && C != E && A != C && A != E && B != E) || (A != B && B != D  && D != E && A != D && A != E && B != E) ) 					//4 Zahlen die ungleich sind + gibt es 1234 oder 2345 oder 3456
						&& ( ( (A == 1 || B == 1 || C == 1 || D == 1 || E == 1) && (A == 2 || B == 2 || C == 2 || D == 2 || E == 2) && (A == 3 || B == 3 || C == 3 || D == 3 || E == 3) && (A == 4 || B == 4 || C == 4 || D == 4 || E == 4) ) 
							|| ( (A == 5 || B == 5 || C == 5 || D == 5 || E == 5) && (A == 2 || B == 2 || C == 2 || D == 2 || E == 2) && (A == 3 || B == 3 || C == 3 || D == 3 || E == 3) && (A == 4 || B == 4 || C == 4 || D == 4 || E == 4) ) 
							|| ( (A == 5 || B == 5 || C == 5 || D == 5 || E == 5) && (A == 6 || B == 6 || C == 6 || D == 6 || E == 6) && (A == 3 || B == 3 || C == 3 || D == 3 || E == 3) && (A == 4 || B == 4 || C == 4 || D == 4 || E == 4) )
							) ) {
					System.out.println("\nKleine Strasse?[K]");	
					kAllowed = true;
				}
				
				if ((players[i].getGrosseStrasseScore() == 0) && (A != B && B != C && C != D && D != E && A != C && A != D && A != E && B != D && B != E && C != E) &&  ( ( (A == 1 || B == 1 || C == 1 || D == 1 || E == 1) && (A != 6 && B != 6 && C != 6 && D != 6 && E != 6 )) || ((A == 6 || B == 6 || C == 6 || D == 6 || E == 6) && (A != 1 && B != 1 && C != 1 && D != 1 && E != 1 ) ) ) )  { //5 Zahlen ungleich + wenn eine 1 dann keine 6/wenn eine 6 dann keine 1
					System.out.println("\nGrosse Strasse?[G]");
					gAllowed = true;
				}
				
				if ((players[i].getKniffelScore() >= 0) && (A == B && B == C && C == D && D == E)) {
					System.out.println("\nKniffel?[KN]");
					knAllowed = true;
				}
				
				
				if (players[i].getChanceScore() == 0) {
					System.out.println("\nChance?[C]");
					cAllowed = true;
				}
				
				System.out.println("\nEine Kategorie streichen?[X]\n");
				
				//Auswahl der Verwendung
				
				textInput = scanner.next();
				do {
					if (textInput.equalsIgnoreCase("e") && eAllowed) {
						if (A == 1) {
							result += A;
						}
						if (B == 1) {
							result += B;
						}
						if (C == 1) {
							result += C;
						}
						
						if (D == 1) {
							result += D;
						}
						
						if (E == 1) {
							result += E;
						}
						players[i].increaseEinserScore(result);
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("z") && zAllowed) {
						if (A == 2) {
							result += A;
						}
						if (B == 2) {
							result += B;
						}
						if (C == 2) {
							result += C;
						}
						
						if (D == 2) {
							result += D;
						}
						
						if (E == 2) {
							result += E;
						}
						players[i].increaseZweierScore(result);
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}			
					
					else if (textInput.equalsIgnoreCase("d") && dAllowed) {
						if (A == 3) {
							result += A;
						}
						if (B == 3) {
							result += B;
						}
						if (C == 3) {
							result += C;
						}
						
						if (D == 3) {
							result += D;
						}
						
						if (E == 3) {
							result += E;
						}
						players[i].increaseDreierScore(result);
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}			
					
					else if (textInput.equalsIgnoreCase("v") && vAllowed) {
						if (A == 4) {
							result += A;
						}
						if (B == 4) {
							result += B;
						}
						if (C == 4) {
							result += C;
						}
						
						if (D == 4) {
							result += D;
						}
						
						if (E == 4) {
							result += E;
						}
						players[i].increaseViererScore(result);
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("f") && fAllowed) {
						if (A == 5) {
							result += A;
						}
						if (B == 5) {
							result += B;
						}
						if (C == 5) {
							result += C;
						}
						
						if (D == 5) {
							result += D;
						}
						
						if (E == 5) {
							result += E;
						}
						players[i].increaseFunferScore(result);	
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("s") && sAllowed) {
						if (A == 6) {
							result += A;
						}
						if (B == 6) {
							result += A;
						}
						if (C == 6) {
							result += C;
						}
						
						if (D == 6) {
							result += D;
						}
						
						if (E == 6) {
							result += E;
						}
						players[i].increaseSechserScore(result);	
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("pd") && pdAllowed) {
						result += A;
						result += A;
						result += C;
						result += D;
						result += E;
						
						players[i].increasePDreiScore(result);	
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("pv") && pvAllowed) {
						result += A;
						result += A;
						result += C;
						result += D;
						result += E;
						
						players[i].increasePVierScore(result);	
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("h") && hAllowed) {
						
						result += 25;
						
						players[i].increaseFullHouseScore(result);	
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("k") && kAllowed) {
						
						result += 30;
						
						players[i].increaseKleineStrasseScore(result);	
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("g") && gAllowed) {
						
						result += 40;
						
						players[i].increaseGrosseStrasseScore(result);	
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("kn") && knAllowed) {
						
						result += 50;
						
						players[i].increaseKniffelScore(result);	
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("c") && cAllowed) {
						result += A;
						result += B;
						result += C;
						result += D;
						result += E;
						
						players[i].increaseChanceScore(result);	
						
						System.out.println("\nEs wurden " + result + " Punkte hinzugefügt\n");
						
						correctInput = true;
					}
					
					else if (textInput.equalsIgnoreCase("x") && ((players[i].getChanceScore() == 0) || (players[i].getKniffelScore() == 0) || (players[i].getGrosseStrasseScore() == 0) || (players[i].getKleineStrasseScore() == 0) || (players[i].getFullHouseScore() == 0) || (players[i].getPVierScore() == 0) || (players[i].getPDreiScore() == 0) || (players[i].getSechserScore() == 0) || (players[i].getFünferScore() == 0) || (players[i].getViererScore() == 0) || (players[i].getDreierScore() == 0) || (players[i].getZweierScore() == 0) || (players[i].getEinserScore() == 0))) {
						xAllowed = true;
						System.out.println("\nWas soll gestrichen werden?\nEinser?[E]; Zweier?[Z]; Dreier?[D];\n Vierer?[V]; Fuenfer?[F]; Sechser?[S];\n Dreierpasch?[PD]?; Viererpasch?[PV]; Full House?[H];\n Kleine Strasse?[K]; Grosse Strasse?[G];\n Kniffel?[KN]; Chance?[C]");
						textInput = scanner.next();
						if (textInput.equalsIgnoreCase("e") && (players[i].getEinserScore() == 0)) {
							result -= 1;
							players[i].increaseEinserScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("z") && (players[i].getZweierScore() == 0)) {
							result -= 1;
							players[i].increaseZweierScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("d") && (players[i].getDreierScore() == 0)) {
							result -= 1;
							players[i].increaseDreierScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("v") && (players[i].getViererScore() == 0)) {
							result -= 1;
							players[i].increaseViererScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("f") && (players[i].getFünferScore() == 0)) {
							result -= 1;
							players[i].increaseFunferScore(result);	
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("s") && (players[i].getSechserScore() == 0)) {
							result -= 1;
							players[i].increaseSechserScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("pd") && (players[i].getPDreiScore() == 0)) {
							result -= 1;
							players[i].increasePDreiScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("pv") && (players[i].getPVierScore() == 0)) {
							result -= 1;
							players[i].increasePVierScore(result);	
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("h") && (players[i].getFullHouseScore() == 0)) {
							result -= 1;
							players[i].increaseFullHouseScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("k") && (players[i].getKleineStrasseScore() == 0)) {
							result -= 1;
							players[i].increaseKleineStrasseScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("g") && (players[i].getGrosseStrasseScore() == 0)) {
							result -= 1;
							players[i].increaseGrosseStrasseScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("kn") && (players[i].getKniffelScore() == 0)) {
							result -= 1;
							players[i].increaseKniffelScore(result);
							correctInput = true;
							
						}
						else if (textInput.equalsIgnoreCase("c") && (players[i].getChanceScore() == 0)) {
							result -= 1;
							players[i].increaseChanceScore(result);	
							correctInput = true;
							
						}
						
						else {
							System.out.println("\nUngluetige Eingabe. Bitte wiederholen.\n");
							textInput = scanner.next();
						}
						
					}
					
					else if (!xAllowed) {//!cAllowed && !knAllowed && !gAllowed && !kAllowed && !hAllowed && !pvAllowed && !pdAllowed && !sAllowed && !fAllowed && !vAllowed && !dAllowed && !zAllowed && !eAllowed) {
						players[i].checkBonus();
						System.out.println("\nDer Spieler " + players[i].getName() + " ist hat das Spiel abgeschlossen.\n" + players[i].getName() + " hat insgesamt " + players[i].getTotalScore() + " Punkte." );
						
						playerFinished ++;
						
						correctInput = true;
					}
					
					else {
						System.out.println("\nUngluetige Eingabe. Bitte wiederholen.\n");
						textInput = scanner.next();
					}
				} while (!correctInput);
				
				fileWriterGameSheet.schreiben(players[i].getName(), players[i].getEinserScore(), players[i].getZweierScore(), players[i].getDreierScore(), players[i].getViererScore(), players[i].getFünferScore(), players[i].getSechserScore(), players[i].getPDreiScore(), players[i].getPVierScore(), players[i].getFullHouseScore(), players[i].getKleineStrasseScore(), players[i].getGrosseStrasseScore(), players[i].getKniffelScore(), players[i].getChanceScore(), players[i].getTotalScore());
				
				//System.out.println("playerfinnished " + playerFinished + "/nplayercount " + playerCount);   test
				
				
			}
		
		}
		
		//Spielende
		for(int i = 0; i < players.length; i++){
			System.out.println("\nDer Spieler " + players[i].getName() + "hat " + players[i].getTotalScore() + "Punkte ingesamt\n");
			if (players[i].getTotalScore() > bestScore){
				bestScore = players[i].getTotalScore();
			}
			
		}
		for(int i = 0; i < players.length; i++){
			if (bestScore == players[i].getTotalScore()){
				System.out.println("\n\nDer Spieler " + players[i].getName() + "hat mit " + players[i].getTotalScore() + " gewonnen\n");
			}
		}
		
		
		
		FileWriterHighScore fileWriterHighScore = new FileWriterHighScore();
		
		System.out.println("\nDie Highscores wurden aktualisiert\n");
		
		for(int i = 0; i < players.length; i++){
			fileWriterHighScore.schreiben(players[i].getName(), players[i].getTotalScore());
		}
		
		System.out.println("\nDas Spiel wurde beendet.\n");
	}
}
