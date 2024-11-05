package com.example.cicd.rpg;

public class Character {
    private String name;
    private String classType;
    private int level;
    private int health;
    private int experience;

    public Character(String name, String classType) {
        this.name = name;
        this.classType = classType;
        this.level = 1;
        this.health = 100;
        this.experience = 0;
    }

    public void completeQuest(Quest quest) {
        this.experience += quest.getReward();

        if (this.experience >= 100) {
            this.levelUp();
            this.experience -= 100;
        }
    }

    public void failQuest(Quest quest) {
        this.health -= 20;

        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void levelUp() {
        this.level += 1;
        this.health += 20;
    }

    public String getCharacterInfo() {
        return "Nom: " + name + ", Classe: " + classType + ", Niveau: " + level + ", Santé: " + health;
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
}

