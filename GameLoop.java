package Tests;

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
}
