package Tests;

import java.util.Random;

public class Battle {

	Random battle = new Random();

	int newHealth, newHealth1;
	int outcome, outcome1, outcome2, outcome3;
	int attack, attack1;
	int defense, defense1;
	int health, health1;
	public int getRandomWithExclusion(Random rnd, int start, int end, int... exclude) {
	    int random = start + rnd.nextInt(end - start + 1 - exclude.length);
	    for (int ex : exclude) {
	        if (random < ex) {
	            break;
	        }
	        random++;
	    }
	    return random;
	}
	public void calcDamage(int multiplier) {
		outcome = attack - defense1;
		outcome1 = multiplier * outcome;
		newHealth1 = health1 - outcome1;
		System.out.println("Your attack does " + outcome + " damage!");
		System.out.println("");
		System.out.println("Enemy Health");
		System.out.println(newHealth1);
		outcome = attack1 - defense;
		outcome1 = multiplier * outcome;
		newHealth = health - outcome1;
		System.out.println("");
		System.out.println("Enemies attack does " + outcome2 + " damage!");
		System.out.println("");
		System.out.println("Your Health");
		System.out.println(newHealth);
	}

	public String getWinner(){
		do{ outcome = attack - defense1;
		newHealth1 = health1 - outcome;
		System.out.println("Your attack does " + outcome + " damage!");
		System.out.println("");
		System.out.println("Enemy Health");
		System.out.println(newHealth1);
		System.out.println("");
		outcome2 = attack1 - defense;
		newHealth = health - outcome2;
		System.out.println("Enemies attack does " + outcome2 + " damage!");
		System.out.println("");
		System.out.println("Your Health");
		System.out.println(newHealth);
		if(newHealth1 > 0 && newHealth > 0){
			calcDamage(2);
			if(newHealth1 > 0 && newHealth > 0){
				calcDamage(3);
				if(newHealth1 > 0 && newHealth > 0){
					calcDamage(4);
					if(newHealth1 > 0 && newHealth > 0){
						calcDamage(5);
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
}