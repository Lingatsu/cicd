package com.example.cicd.rpg;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identifiant unique pour chaque personnage
    private String name; // Nom du personnage
    private String classType; // Classe du personnage (Mage, Guerrier, etc.)
    private int level; // Niveau du personnage
    private int health; // Points de vie
    private int experience; // Points d'expérience

    // Constructeur sans argument requis par JPA
    public Character() {
        this.level = 1; // Niveau initial
        this.health = 100; // Santé initiale
        this.experience = 0; // Points d'expérience initiaux
    }

    // Constructeur avec paramètres pour initialiser un personnage
    public Character(String name, String classType) {
        this.name = name;
        this.classType = classType;
        this.level = 1; // Niveau initial
        this.health = 100; // Santé initiale
        this.experience = 0; // Points d'expérience initiaux
    }

    // Méthode pour accomplir une quête
    public void completeQuest(Quest quest) {
        this.experience += quest.getReward(); // Ajoute la récompense de la quête

        // Vérifie si l'expérience accumulée atteint 100 pour un niveau supérieur
        if (this.experience >= 100) {
            this.levelUp(); // Augmente le niveau
            this.experience -= 100; // Réinitialise l'expérience
        }
    }

    // Méthode pour gérer l'échec d'une quête
    public void failQuest(Quest quest) {
        this.health -= 20; // Diminue la santé de 20

        // Empêche la santé d'être négative
        if (this.health < 0) {
            this.health = 0;
        }
    }

    // Méthode pour augmenter le niveau du personnage
    public void levelUp() {
        this.level += 1; // Augmente le niveau
        this.health += 20; // Récupère 20 points de santé
    }

    // Méthode pour obtenir des informations sur le personnage
    public String getCharacterInfo() {
        return "Nom: " + name + ", Classe: " + classType + ", Niveau: " + level + ", Santé: " + health;
    }

    // Getters pour accéder aux attributs
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassType() {
        return classType;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }
}
