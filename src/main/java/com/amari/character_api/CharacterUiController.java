package com.amari.character_api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

     @GetMapping("/characters/create")
      public String showCreateForm() {
        return "character-create";
      }

      @PostMapping("/characters/create")
       public String createCharacter(Character character) {
         Character savedCharacter = characterService.createCharacter(character);
          return "redirect:/characters/" + savedCharacter.getCharacterId();
       }
    
        @GetMapping("/characters/{id}/edit")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Character character = characterService.getCharacterById(id)
                .orElseThrow(() -> new RuntimeException("Character was not found"));

        model.addAttribute("character", character);
        return "character-update";
    }

    @PostMapping("/characters/{id}/edit")
    public String updateCharacter(@PathVariable Long id, Character character) {
        characterService.updateCharacter(id, character);
        return "redirect:/characters/" + id;
    }

     @GetMapping("/characters/{id}/delete")
    public String deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return "redirect:/characters";

}


}
