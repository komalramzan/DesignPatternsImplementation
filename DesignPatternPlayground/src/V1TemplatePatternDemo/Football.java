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
public class Football extends Game {

   @Override
   void endPlay() {
      System.out.println("Football Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("Football Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Football Game Started. Enjoy the game!");
   }
   
    void breakForRefreshment(){
       System.out.println("Refreshment Started. Enjoy the break!");
  }

    @Override
    void performShiftNow() {
        System.out.println("The pole are shifted between the teams");
    }
}
