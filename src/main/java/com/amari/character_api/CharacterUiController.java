package com.amari.character_api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

}


