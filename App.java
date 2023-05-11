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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Static Polymorphism pada class Hero
        Hero hero = new Hero();
        System.out.println("=======================================================");
        System.out.println("Static Polymorphism pada class Hero");
        System.out.println("=======================================================");
        hero.move();
        hero.move("west");

        // Static Polymorphism pada class Enemy
        Enemy enemy = new Enemy();
        System.out.println("\n\n=======================================================");
        System.out.println("Static Polymorphism pada class Enemy");
        System.out.println("=======================================================");
        enemy.move();
        enemy.move(6);

        // Dynamic Polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character character = new Hero();
        System.out.println("\n\n=======================================================");
        System.out.println("Dynamic Polymorphism: Hero, Enemy, Witch, dan Fighter");
        System.out.println("=======================================================");
        character.move();
        
        character = new Enemy();
        character.move();
        
        character = new Witch();
        character.move();
        
        character = new Fighter();
        character.move();

        // Dynamic Polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Witch witch = new Witch();
        Character fighter = (Character) witch;
        System.out.println("\n\n=======================================================");
        System.out.println("Dynamic Polymorphism: witch menjadi Fighter");
        System.out.println("=======================================================");
        fighter.move();
    }

    // Method untuk mengubah objek Witch menjadi objek Fighter
    public static Fighter convertToFighter(Character character) {
        if (character instanceof Witch) {
            Witch witch = (Witch) character;
            Fighter fighter = new Fighter();
            return fighter;
        } else {
            return null;
        }
    }
}