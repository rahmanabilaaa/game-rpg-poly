/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila_game.rpg.pkg5;

/**
 *
 * @author salsa
 */
public class Hero extends Character {
    public void move() {
        System.out.println("Hero moves to Enemy");
    }

    public void move(String direction) {
        System.out.println("Hero moves " + direction + " towards the Enemy");
    }
}
