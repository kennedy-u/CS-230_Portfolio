package com.gamingroom;

/**
* A simple class to hold information about a player
*
* @author kennedy.uzoho@snhu.edu
*
*/
public class Player extends Entity{
  
   /*
   * Constructor with an identifier and name
   */
   public Player(long id, String name) {
       super(id, name);
   }

/*
* IGNORED PER DISCUSSION
*
* Constructor with an identifier, name, and team
*
public Player(long id, String name, Team team) {
super(id, name);
}
*/

   @Override
   public String toString() {
       return "Player [id=" + super.getId() + ", name=" + super.getName() + "]";
   }
}
