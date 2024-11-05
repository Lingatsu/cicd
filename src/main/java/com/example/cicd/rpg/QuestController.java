package com.example.cicd.rpg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quests")
public class QuestController {

    @Autowired
    private QuestRepository questRepository; // Repository pour gérer les quêtes

    // Créer une nouvelle quête
    @PostMapping
    public ResponseEntity<Quest> createQuest(@RequestBody Quest quest) {
        Quest savedQuest = questRepository.save(quest);
        return new ResponseEntity<>(savedQuest, HttpStatus.CREATED);
    }

    // Récupérer toutes les quêtes
    @GetMapping
    public List<Quest> getAllQuests() {
        return questRepository.findAll();
    }
}
