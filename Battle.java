package Tests;

import java.util.Random;

public class Battle {

	Random battle = new Random();

	int newHealth, newHealth1;
	int outcome, outcome1, outcome2, outcome3;

	
	public int getRandomWithExclusion(int start, int end, int... exclude) {
	    int random = start + battle.nextInt(end - start + 1 - exclude.length);
	    for (int ex : exclude) {
	        if (random < ex) {
	            break;
	        }
	        random++;
	    }
	    return random;
	}
	public void calcDamage(int multiplier, Player player) {
		outcome = player.attack - player.defense1;
		outcome1 = multiplier * outcome;
		newHealth1 = player.health1 - outcome1;
		System.out.println("Your attack does " + outcome + " damage!");
		System.out.println("");
		System.out.println("Enemy Health");
		System.out.println(newHealth1);
		outcome = player.attack1 - player.defense;
		outcome1 = multiplier * outcome;
		newHealth = player.health - outcome1;
		System.out.println("");
		System.out.println("Enemies attack does " + outcome2 + " damage!");
		System.out.println("");
		System.out.println("Your Health");
		System.out.println(newHealth);
	}

	public String getScore(Player player){
		do{ outcome = player.attack - player.defense1;
		newHealth1 = player.health1 - outcome;
		System.out.println("Your attack does " + outcome + " damage!");
		System.out.println("");
		System.out.println("Enemy Health");
		System.out.println(newHealth1);
		System.out.println("");
		outcome2 = player.attack1 - player.defense;
		newHealth = player.health - outcome2;
		System.out.println("Enemies attack does " + outcome2 + " damage!");
		System.out.println("");
		System.out.println("Your Health");
		System.out.println(newHealth);
		if(newHealth1 > 0 && newHealth > 0){
			calcDamage(2, player);
			if(newHealth1 > 0 && newHealth > 0){
				calcDamage(3, player);
				if(newHealth1 > 0 && newHealth > 0){
					calcDamage(4, player);
					if(newHealth1 > 0 && newHealth > 0){
						calcDamage(5, player);
						}
				}
			}
		}
		}while(newHealth1 > 0 && newHealth > 0);
		if(newHealth1 <= 0 && newHealth > 0){
			return("You win!");}
		if(newHealth <= 0 && newHealth1 > 0){
			return("You lose!");}
		else{
			return("Draw!");}
	}
	public void printBattle(int match , Player character) {
		if(match == 1){
            System.out.println("pikachu!");
            System.out.println("");
            character.attack1 = 6;
            character.defense1 = 0;
            character.health1 = 19;
            System.out.println(getScore(character));
        }
		else if(match == 2){
            System.out.println("celebi!");
            System.out.println("");
            character.attack1 = 8;
            character.defense1 = 1;
            character.health1 = 16;
            System.out.println(getScore(character));
        }else if(match == 3){
            System.out.println("snorlax!");
            System.out.println("");
            character.attack1 = 5;
            character.defense1 = 2;
            character.health1 = 18;
            System.out.println(getScore(character));
        }else if(match == 4){
            System.out.println("charizard!");
            System.out.println("");
            character.attack1 = 10;
            character.defense1 = 0;
            character.health1 = 15;
            System.out.println(getScore(character));
        }else if(match == 5){
            System.out.println("ditto!");
            System.out.println("");
            character.attack1 = 7;
            character.defense1 = 1;
            character.health1 = 17;
            System.out.println(getScore(character));
        }else if(match == 6){
            System.out.println("eevee!");
            System.out.println("");
            character.attack1 = 13;
            character.defense1 = 2;
            character.health1 = 10;
            System.out.println(getScore(character));}
	}
}