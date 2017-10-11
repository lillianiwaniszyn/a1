package Tests;

import java.util.Scanner;

public class GameLoop {
    public void printMainScreen() {
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
    public boolean playAgain(int restart) throws IllegalArgumentException{
        if(restart == 1){
            System.out.println("");
            return false;
        }else if(restart == 2){
            System.out.println("Thank you for playing!");
            return true;
           }
        else throw new IllegalArgumentException ("not a valid option");
            }
    public void printFightAgain() {
        System.out.println("");
        System.out.println("Fight again?");
        System.out.println("1 for Yes");
        System.out.println("2 for No");
    }
    public void pickBattleLoop(){
        int hero, match, restart;
        Battle bat = new Battle();
        Player pikachu = new Player(6,0,19);
        Player celebi = new Player(8,1,16);
        Player snorlax = new Player(5,2,18);
        Player charizard = new Player(10,0,15);
        Player ditto = new Player(7,1,17);
        Player eevee = new Player(13,2,10);
        Player pokemon = new Player(1,1,1);
        Scanner input = new Scanner(System.in);
        hero = input.nextInt();
        System.out.println("You have chosen " + pokemon.getPlayer(hero));

            while(hero == 1){

                System.out.println("Your battle is against....");
                System.out.println("");
                match = bat.getRandomWithExclusion(1,6,1);
                bat.printBattle(match, pikachu);
                printFightAgain();
                restart = input.nextInt();
                if(playAgain(restart) == true)
                	break;

                    }
                    
            while(hero == 2){
                System.out.println("Your battle is against....");
                System.out.println("");
                match = bat.getRandomWithExclusion(1,6,2);
                bat.printBattle(match, celebi);
                printFightAgain();
                restart = input.nextInt();
                if(playAgain(restart) == true)
                	break;

                    }
                    
            while(hero == 3){
                System.out.println("Your battle is against....");
                System.out.println("");
                match = bat.getRandomWithExclusion(1,6,3);
                bat.printBattle(match, snorlax);
                printFightAgain();
                restart = input.nextInt();
                if(playAgain(restart) == true)
                	break;

                    }
                    
            while(hero == 4){
                System.out.println("Your battle is against....");
                System.out.println("");
                match = bat.getRandomWithExclusion(1,6,4);
                bat.printBattle(match, charizard);
                printFightAgain();
                restart = input.nextInt();
                if(playAgain(restart) == true)
                	break;

                    }
                    
            while(hero == 5){
                System.out.println("Your battle is against....");
                System.out.println("");
                match = bat.getRandomWithExclusion(1,6,5);
                printFightAgain();
                restart = input.nextInt();
                if(playAgain(restart) == true)
                	break;

                    }
                    
            while(hero == 6){
                System.out.println("Your battle is against....");
                System.out.println("");
                match = bat.getRandomWithExclusion(1,6,6);
                bat.printBattle(match, eevee);
                printFightAgain();
                restart = input.nextInt();
                if(playAgain(restart) == true)
                	break;

                    }
    	
    }
}
