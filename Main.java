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
            bat.printBattle(match, celebi);
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
            bat.printBattle(match, snorlax);
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
            bat.printBattle(match, charizard);
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
            bat.printBattle(match, ditto);
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
            bat.printBattle(match, eevee);
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
                