
public class Game {

	public static void main(String[] args) {
		int numofGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotcom theDotCom = new SimpleDotcom();
		int randomNum = (int) (Math.random()*5);
		
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		theDotCom.setlocationCells(locations);
		boolean isAlive=true;
		
		while(isAlive==true)
		{
			
			String  guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numofGuesses++;
			if(result.equals("kill"))
			{
				isAlive=false;
				System.out.println("You took "+ numofGuesses + "guesses");
			}
		}
	}

}
