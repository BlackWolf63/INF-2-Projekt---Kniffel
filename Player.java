public class Player {
	
	String name;
	public int totalScore;	
	
	public int	einserScore;
	public int	zweierScore;
	public int	dreierScore;
	public int	viererScore;
	public int	fünferScore;
	public int	sechserScore;
	public int	pDreiScore;
	public int	pVierScore;
	public int	fullHouseScore;
	public int	kleineStrasseScore;
	public int	grosseStrasseScore;
	public int	kniffelScore;
	public int	chanceScore;
	
	public int fristHalfScore;

	

	public Player(String argName) {
		name = argName;
		
		totalScore = 0;
		
		einserScore = 0;
		zweierScore = 0;
		dreierScore = 0;
		viererScore = 0;
		fünferScore = 0;
		sechserScore = 0;
		pDreiScore = 0;
		pVierScore = 0;
		fullHouseScore = 0;
		kleineStrasseScore = 0;
		grosseStrasseScore = 0;
		kniffelScore = 0;
		chanceScore = 0;
		
		fristHalfScore = 0;
		
	}
	
	public String getName() {
		return name;
	} 
	
	public int getTotalScore() {
		return totalScore;
	}
	
	public int getEinserScore() {
		return einserScore;
	}
	
	public int getZweierScore() {
		return zweierScore;
	}	
	
	public int getDreierScore() {
		return dreierScore;
	}	

	public int getViererScore() {
		return viererScore;
	}
	
	public int getFünferScore() {
		return fünferScore;
	}

	public int getSechserScore() {
		return sechserScore;
	}	
	
	public int getPDreiScore() {
		return pDreiScore;
	}

	public int getPVierScore() {
		return pVierScore;
	}

	public int getFullHouseScore() {
		return fullHouseScore;
	}

	public int getKleineStrasseScore() {
		return kleineStrasseScore;
	}

	public int getGrosseStrasseScore() {
		return grosseStrasseScore;
	}

	public int getKniffelScore() {
		return kniffelScore;
	}
	
	public int getChanceScore() {
		return chanceScore;
	}
	
	
	
	
	public void increaseEinserScore(int argResult) {
		einserScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
		
	}
	
	public void increaseZweierScore(int argResult) {
		zweierScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}	
	
	public void increaseDreierScore(int argResult) {
		dreierScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}	

	public void increaseViererScore(int argResult) {
		viererScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}
	
	public void increaseFunferScore(int argResult) {
		fünferScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}

	public void increaseSechserScore(int argResult) {
		sechserScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}	
	
	public void increasePDreiScore(int argResult) {
		pDreiScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}

	public void increasePVierScore(int argResult) {
		pVierScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}

	public void increaseFullHouseScore(int argResult) {
		fullHouseScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}

	public void increaseKleineStrasseScore(int argResult) {
		kleineStrasseScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}

	public void increaseGrosseStrasseScore(int argResult) {
		grosseStrasseScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}

	public void increaseKniffelScore(int argResult) {
		kniffelScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}
	
	public void increaseChanceScore(int argResult) {
		chanceScore += argResult;
		if(argResult >= 0)  {
			totalScore += argResult;
		}
		
	}
	
	public void checkBonus() {
		if (einserScore > 0) {
			fristHalfScore += einserScore;
		}
		if (zweierScore > 0) {
			fristHalfScore += zweierScore;
		}
		if (dreierScore > 0) {
			fristHalfScore += dreierScore;
		}
		if (viererScore > 0) {
			fristHalfScore += viererScore;
		}
		if (fünferScore > 0) {
			fristHalfScore += fünferScore;
		}
		if (sechserScore > 0) {
			fristHalfScore += sechserScore;
		}
		
		if (fristHalfScore >= 63) {
			totalScore += 35;
			System.out.println("\nEs wurde ein Bonus von 35 Punkte für die erste Haelfte gutgeschrieben.\n");
		}
		else {
			System.out.println("\nEs wurde kein Bonus für die erste Haelfte gutgeschrieben.\n");
		}
		
	}
}