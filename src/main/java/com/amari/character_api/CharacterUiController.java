package com.amari.character_api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CharacterUiController {

    private final CharacterService characterService;

    public CharacterUiController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/characters")
    public String showCharacterList(Model model) {
        model.addAttribute("characterList", characterService.getAllCharacters());
        return "character-list";
    }

    @GetMapping("/characters/{id}")
    public String showCharacterDetails(@PathVariable Long id, Model model) {
        Character character = characterService.getCharacterById(id)
                .orElseThrow(() -> new RuntimeException("Character was not found"));

        model.addAttribute("character", character);
        return "character-details";
    }
}