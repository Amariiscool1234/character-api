package com.amari.character_api;


import org.springframework.web.bind.annotation.*;

 import java.util.List;


@RestController
@RequestMapping
public class CharacterController {


     private final CharacterService characterService;

      public CharacterController (CharacterService characterService) {
          this.characterService = characterService;

              
      }

         // getting all the characters

         @GetMapping
         public List<Character> getAll() {
             return characterService.getAllCharacters();
                
         }

           // get by ID
           @GetMapping("/{id}")
              public Character getById(@PathVariable Long id) {
                  return characterService.getCharacterById(id)
                    .orElseThrow(() -> new RuntimeException("Character was not found"));

              }

               // Create new character

                  @PostMapping
                   public Character update(@RequestBody Character character) {
                       return characterService.createCharacter(character);
                          
                   }

                     // Update the character

                      @PutMapping("/{id}")
                     public Character update(@PathVariable Long id, @RequestBody Character character) {
                return characterService.updateCharacter(id, character);
    }

              // Delete the character
                     @DeleteMapping("/{id}")
                       public void delete(@PathVariable Long id) {
                      characterService.deleteCharacter(id);
    }

                   // Search by name
                                 @GetMapping("/search")
                             public List<Character> search(@RequestParam String name) {
                                return characterService.searchByName(name);
    }

                    // Filter by universe
                       @GetMapping("/universe/{universe}")
                           public List<Character> filterByUniverse(@PathVariable String universe) {
                            return characterService.filterByUniverse(universe);
    }
    
}
