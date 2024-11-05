package com.example.cicd.rpg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    // Test pour vérifier que le constructeur initialise bien le niveau à 1
    @Test
    public void testConstructorInitializesLevelToOne() {
        // Création d'un personnage avec le constructeur
        com.example.cicd.rpg.Character character = new com.example.cicd.rpg.Character("Aragorn", "Guerrier");

        // Vérification que le niveau est bien initialisé à 1
        assertEquals(1, character.getLevel(), "Le niveau initial du personnage devrait être 1");
    }

    // Test pour vérifier que levelUp() augmente bien le niveau de 1
    @Test
    public void testLevelUpIncreasesLevelByOne() {
        // Création d'un personnage
        com.example.cicd.rpg.Character character = new Character("Legolas", "Archer");

        // Appel de la méthode levelUp pour augmenter le niveau
        character.levelUp();

        // Vérification que le niveau est maintenant égal à 2
        assertEquals(2, character.getLevel(), "Le niveau devrait être 2 après un levelUp");

        // Appel de levelUp une seconde fois
        character.levelUp();

        // Vérification que le niveau est maintenant égal à 3
        assertEquals(3, character.getLevel(), "Le niveau devrait être 3 après deux appels de levelUp");
    }
}