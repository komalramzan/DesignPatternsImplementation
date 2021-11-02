/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package V1TemplatePatternDemo;

/**
 *
 * @author fa18-bse-079
 */
public abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void performShiftNow();
   abstract void endPlay();
   abstract void breakForRefreshment();
   //template method
   public final void play(){

      //initialize the game
      initialize();

      //start game
      startPlay();
      
     //performShiftNow
     performShiftNow();

      //breakForRefreshment
      breakForRefreshment();
      
      //end game
      endPlay();
      
      
   }
}
