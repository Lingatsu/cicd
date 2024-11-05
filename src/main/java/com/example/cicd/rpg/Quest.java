package com.example.cicd.rpg;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identifiant unique pour chaque quête
    private String questName; // Nom de la quête
    private String difficulty; // Difficulté de la quête
    private int reward; // Récompense de la quête en points d'expérience

    // Constructeur sans argument requis par JPA
    public Quest() {
    }

    // Constructeur avec paramètres
    public Quest(String questName, String difficulty, int reward) {
        this.questName = questName;
        this.difficulty = difficulty;
        this.reward = reward;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getQuestName() {
        return questName;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getReward() {
        return reward;
    }
}
