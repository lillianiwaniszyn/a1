package Tests;

public class Player {
    public String getPlayer(int hero) throws IllegalArgumentException{
    	if (hero ==1)
    		return "pikachu";
    	if (hero ==2)
    		return "celebi";
    	if (hero ==3)
    		return "snorlax";
    	if (hero ==4)
    		return "charizard";
    	if (hero ==5)
    		return "ditto";
    	if (hero ==6)
    		return "eevee";
    	else throw new IllegalArgumentException ("not a valid option");

    	 }

}
