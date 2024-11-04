package com.example.cicd.tp1;

public class Character {
    private String name;
    private String classType;
    private int level;

    public Character(String name, String classType) {
        this.name = name;
        this.classType = classType;
        this.level = 1;
    }

    public void levelUp() {
        this.level += 1;
    }

    public String getCharacterInfo() {
        return "Nom: " + name + ", Classe: " + classType + ", Niveau: " + level;
    }

    public int getLevel() {
        return level;
    }

}

