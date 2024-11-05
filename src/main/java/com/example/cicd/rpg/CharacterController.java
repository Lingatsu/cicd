package com.example.cicd.rpg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    // Créer un personnage
    @PostMapping
    public ResponseEntity<Character> createCharacter(@RequestBody Character character) {
        Character savedCharacter = characterRepository.save(character);
        return new ResponseEntity<>(savedCharacter, HttpStatus.CREATED);
    }

    // Récupérer tous les personnages
    @GetMapping
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }
}
