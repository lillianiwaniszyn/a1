package Tests;

import java.util.Random;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    int hero, match, restart;
    Battle bat = new Battle();
    Player pikachu = new Player(6,0,19);
    Player celebi = new Player(8,1,16);
    Player snorlax = new Player(5,2,18);
    Player charizard = new Player(10,0,15);
    Player ditto = new Player(7,1,17);
    Player eevee = new Player(13,2,10);
    GameLoop game = new GameLoop();
    Player pokemon = new Player(1,1,1);


    game.printMainScreen();
    hero = input.nextInt();
    System.out.println("You have chosen " + pokemon.getPlayer(hero));

        while(hero == 1){

            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,1);
            bat.printBattle(match, pikachu);
            game.printFightAgain();
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 2){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,2);
            bat.printBattle(match, celebi);
            game.printFightAgain();
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 3){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,3);
            bat.printBattle(match, snorlax);
            game.printFightAgain();
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 4){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,4);
            bat.printBattle(match, charizard);
            game.printFightAgain();
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 5){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,5);
            game.printFightAgain();
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                
        while(hero == 6){
            System.out.println("Your battle is against....");
            System.out.println("");
            match = bat.getRandomWithExclusion(1,6,6);
            bat.printBattle(match, eevee);
            game.printFightAgain();
            restart = input.nextInt();
            if(game.playAgain(restart) == true)
            	break;

                }
                }
                }
                