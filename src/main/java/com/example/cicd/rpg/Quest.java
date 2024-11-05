package com.example.cicd.rpg;

public class Quest {
    private String questName;
    private String difficulty;
    private int reward;

    public Quest(String questName, String difficulty, int reward) {
        this.questName = questName;
        this.difficulty = difficulty;
        this.reward = reward;
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
