package com.example.cicd.rpg;

public class Main {
    public static void main(String[] args) {
        // Création d'un personnage
        Character myCharacter = new Character("Aragorn", "Guerrier");

        // Affiche les informations initiales du personnage
        System.out.println(myCharacter.getCharacterInfo());

        // Augmente le niveau du personnage
        myCharacter.levelUp();

        // Affiche les informations après un level up
        System.out.println(myCharacter.getCharacterInfo());
    }
}
