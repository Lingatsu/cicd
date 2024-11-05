package com.example.cicd.rpg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    // Test pour vérifier que le constructeur initialise bien le niveau à 1
    @Test
    public void testConstructorInitializesLevelToOne() {
        Character character = new Character("Meliodas", "Démon");
        assertEquals(1, character.getLevel(), "Le niveau initial du personnage devrait être 1");
        assertEquals("Meliodas", character.getName(), "Le nom du personnage devrait être Meliodas");
        assertEquals("Démon", character.getClassType(), "La classe du personnage devrait être Démon");
        assertEquals(100, character.getHealth(), "La santé initiale du personnage devrait être 100");
    }

    // Test pour vérifier que levelUp() augmente bien le niveau de 1
    @Test
    public void testLevelUpIncreasesLevelByOne() {
        Character character = new Character("Diane", "Géante");
        character.levelUp();
        assertEquals(2, character.getLevel(), "Le niveau devrait être 2 après un levelUp");
    }

    // Test pour vérifier que le niveau augmente après avoir accompli une quête réussie
    @Test
    public void testCompleteQuestIncreasesLevel() {
        Character character = new Character("Ban", "Homme");
        Quest easyQuest = new Quest("Trouver le trésor", "Facile", 100); // Quête facile
        character.completeQuest(easyQuest);
        assertEquals(2, character.getLevel(), "Le niveau devrait être 2 après avoir complété une quête facile.");
    }

    // Test pour vérifier que la santé diminue après un échec à accomplir une quête
    @Test
    public void testFailingQuestDecreasesHealth() {
        Character character = new Character("Gowther", "Poupée Magique");
        Quest hardQuest = new Quest("Combattre le démon", "Difficile", 100); // Quête difficile
        character.failQuest(hardQuest);
        assertEquals(80, character.getHealth(), "La santé devrait diminuer à 80 après un échec à la quête.");
    }
}
