package Tests;

import java.util.Random;
import java.util.Scanner;

public class Main {


	public static void printBattle(int match , Battle character) {
		if(match == 1){
            System.out.println("pikachu!");
            System.out.println("");
            character.attack1 = 6;
            character.defense1 = 0;
            character.health1 = 19;
            System.out.println(character.getWinner());
        }
		else if(match == 2){
            System.out.println("celebi!");
            System.out.println("");
            character.attack1 = 8;
            character.defense1 = 1;
            character.health1 = 16;
            System.out.println(character.getWinner());
        }else if(match == 3){
            System.out.println("snorlax!");
            System.out.println("");
            character.attack1 = 5;
            character.defense1 = 2;
            character.health1 = 18;
            System.out.println(character.getWinner());
        }else if(match == 4){
            System.out.println("charizard!");
            System.out.println("");
            character.attack1 = 10;
            character.defense1 = 0;
            character.health1 = 15;
            System.out.println(character.getWinner());
        }else if(match == 5){
            System.out.println("ditto!");
            System.out.println("");
            character.attack1 = 7;
            character.defense1 = 1;
            character.health1 = 17;
            System.out.println(character.getWinner());
        }else if(match == 6){
            System.out.println("eevee!");
            System.out.println("");
            character.attack1 = 13;
            character.defense1 = 2;
            character.health1 = 10;
            System.out.println(character.getWinner());}
	}

	public static int getRandomWithExclusion(Random rnd, int start, int end, int... exclude) {
	    int random = start + rnd.nextInt(end - start + 1 - exclude.length);
	    for (int ex : exclude) {
	        if (random < ex) {
	            break;
	        }
	        random++;
	    }
	    return random;
	}

    private static String getPlayer(int hero) {
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
    	else return "Error";

    	 }
    public static void printMainScreen() {
        System.out.println("Choose your HERO");
        System.out.println("Press 1 pikachu");             
        System.out.println("Attack      6");               
        System.out.println("Defense     0");               
        System.out.println("Health      19");
        System.out.println("Press 2 celebi");
        System.out.println("Attack      8");
        System.out.println("Defense     1");
        System.out.println("Health      16");
        System.out.println("Press 3 for snorlax");
        System.out.println("Attack      5");               
        System.out.println("Defense     2");                
        System.out.println("Health      18");                
        System.out.println("Press 4 for charizard");
        System.out.println("Attack      10");
        System.out.println("Defense     0");
        System.out.println("Health      15"); 
        System.out.println("Press 5 ditto");         
        System.out.println("Attack      7");               
        System.out.println("Defense     1");              
        System.out.println("Health      17");              
        System.out.println("Press 6 for eevee");
        System.out.println("Attack      13");
        System.out.println("Defense     2");
        System.out.println("Health      10");
        

    	
    }
    private static boolean playAgain(int restart) {
        if(restart == 1){
            System.out.println("");
        }else if(restart == 2){
            System.out.println("Thank you for playing!");
            return true;
           }
        else {
        	return false;
        }
		return false;
            }
    	
    

public static void main(String[] args) {
	
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    int hero, match, restart;
    //String winner;
    Random battle = new Random();
    Battle pikachu = new Battle();
    Battle celebi = new Battle();
    Battle snorlax = new Battle();
    Battle charizard = new Battle();
    Battle ditto = new Battle();
    Battle eevee = new Battle();

    pikachu.attack = 6;
    pikachu.defense = 0;
    pikachu.health = 19;

    celebi.attack = 8;
    celebi.defense = 1;
    celebi.health = 16;

    snorlax.attack = 5;
    snorlax.defense = 2;
    snorlax.health = 18;

    charizard.attack = 10;
    charizard.defense =0;
    charizard.health = 15;

    ditto.attack = 7;
    ditto.defense = 1;
    ditto.health = 17;

    eevee.attack = 13;
    eevee.defense = 2;
    eevee.health = 10;

    printMainScreen();
    hero = input.nextInt();
    System.out.println("You have chosen " + getPlayer(hero));

        while(hero == 1){

            System.out.println("Your battle is against....");
            System.out.println("");
            match = getRandomWithExclusion(battle,1,6,1);
            printBattle(match, pikachu);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(playAgain(restart) == true)
            	break;

                }
                
        while(hero == 2){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = getRandomWithExclusion(battle,1,6,2);
            printBattle(match, celebi);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(playAgain(restart) == true)
            	break;

                }
                
        while(hero == 3){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = getRandomWithExclusion(battle,1,6,3);
            printBattle(match, snorlax);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(playAgain(restart) == true)
            	break;

                }
                
        while(hero == 4){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = getRandomWithExclusion(battle,1,6,4);
            printBattle(match, charizard);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(playAgain(restart) == true)
            	break;

                }
                
        while(hero == 5){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = getRandomWithExclusion(battle,1,6,5);
            printBattle(match, ditto);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(playAgain(restart) == true)
            	break;

                }
                
        while(hero == 6){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = getRandomWithExclusion(battle,1,6,6);
            printBattle(match, eevee);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(playAgain(restart) == true)
            	break;

                }
                }
                }
                