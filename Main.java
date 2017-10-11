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







    	
    

public static void main(String[] args) {
	
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    int hero, match, restart;
    Battle bat = new Battle();
    Battle pikachu = new Battle();
    Battle celebi = new Battle();
    Battle snorlax = new Battle();
    Battle charizard = new Battle();
    Battle ditto = new Battle();
    Battle eevee = new Battle();
    GameLoop game = new GameLoop();
    Player pokemon = new Player();

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

    game.printMainScreen();
    hero = input.nextInt();
    System.out.println("You have chosen " + pokemon.getPlayer(hero));

        while(hero == 1){

            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,1);
            printBattle(match, pikachu);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 2){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,2);
            printBattle(match, celebi);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 3){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,3);
            printBattle(match, snorlax);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 4){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,4);
            printBattle(match, charizard);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 5){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,5);
            printBattle(match, ditto);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 6){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,6);
            printBattle(match, eevee);
            System.out.println("");
            System.out.println("Fight again?");
            System.out.println("1 for Yes");
            System.out.println("2 for No");
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                }
                }
                