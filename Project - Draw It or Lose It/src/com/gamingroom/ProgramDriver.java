package com.gamingroom;

/**
* Application start-up program
*
* @author kennedy.uzoho@snhu.edu
*/
public class ProgramDriver {
  
	   /**
	   * The one-and-only main() method
	   *
	   * @param args command line arguments
	   */
	   public static void main(String[] args) {

	       // Initialize the singleton GameService instance
	       GameService service = GameService.getInstance();
      
	       System.out.println("\nAbout to test initializing game data...");

	       // initialize with some game data
	       Game game1 = service.addGame("Game #1");
	       System.out.println(game1);
	       Game game2 = service.addGame("Game #2");
	       System.out.println(game2);
	       Game game3 = service.addGame("Game #3");
	       System.out.println(game3);
	       Game game4 = service.addGame("Game #4");
	       System.out.println(game4);
	       Game game5 = service.addGame("Game #5");
	       System.out.println(game5);
  
       // use another class to prove there is only one instance
       SingletonTester tester = new SingletonTester();
       tester.testSingleton();
   }
}
