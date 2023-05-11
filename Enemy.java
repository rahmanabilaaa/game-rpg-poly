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
public class Enemy extends Character {
    public void move() {
        System.out.println("Enemy moves to Hero");
    }

    public void move(int step) {
        System.out.println("The Enemy moves " + step + " steps forward to Hero");
    }
}
