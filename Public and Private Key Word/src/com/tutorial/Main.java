package com.tutorial;

class Player{
//Data member
String name; //default, bisa diakses oleh class lain
public int exp; // public, bisa diakses oleh class lai
private int health; //private, tidak bisa diakses oleh class lain

Player(String name, int exp, int health) {
this.name = name;
this.exp = exp;
this.health = health;


}
void Display() {
    System.out.println("Nama Player : " + this.name);
    System.out.println("Player EXP : " + this.exp);
    System.out.println("Player health : " + this.health);
}

}
public class Main {
    public static void main(String[] args) {
        // instalisasi atau pembuat objek baru
        Player hero_1 = new Player("Admira", 25, 40);
        
        hero_1.Display();
    }
}
