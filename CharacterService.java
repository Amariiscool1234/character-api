package com.amari.character_api;

 import org.springframework.stereotype.Service;
   import java.util.List;
  import java.util.Optional;




 @Service
public class CharacterService {
     
      private final CharacterRepository characterRepository;
   
       public CharacterService(CharacterRepository characterRepository) {
           this.characterRepository = characterRepository;
             
       }

         // getting all the characters
           public List<Character> getAllCharacters(){
              return characterRepository.findAll();

           }

        // Getting ID

         public Optional<Character> getCharacterById(long id) {
             return characterRepository.findById(id);

         }

          // creating the creating
            public Character createCharacter(Character character) {
                 return characterRepository.save(character);

            }

             //update character 

             public Character updateCharacter(Long id, Character updated) {
                return characterRepository.findById(id)
                  .map(character ->  {
                     character.setName(updated.getName());
                     character.setDescription(updated.getDescription());
                     character.setUniverse(updated.getUniverse());
                     character.setSpecies(updated.getSpecies());
                     return characterRepository.save(character);
                  })
                   .orElseThrow(() -> new RuntimeException("Character was not found"));
             }

              // Delete the character 
                 public void deleteCharacter(Long id) {
                     characterRepository.deleteById(id);

                 }

                   // search name  
                     public List<Character> searchByName(String name) {
                         return characterRepository.findByNameContaining(name);

                     }

                      // Filter by the universe

                        public List<Character> filterByUniverse(String universe) {
                                return characterRepository.findByUniverse(universe);
                                
                        }

}
