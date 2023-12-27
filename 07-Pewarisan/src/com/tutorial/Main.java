package com.tutorial;

class Hero{
    String nama;
    float health;

    void display(){
        System.out.println("Nama Hero : " + nama);
        System.out.println("Health : " + health);
    }
}

class HeroTank extends Hero{
    void display(){
         System.out.println("Nama Hero : " + nama);
         System.out.println("Health : " + health);

    }
}
public class Main {
    public static void main(String[] args) {
        Hero hero_1 = new Hero();
        hero_1.nama = "Florin";
        hero_1.display();

        HeroTank hero_2 = new HeroTank();
        hero_2.nama = "Angela";
        hero_2.display();

    }
}