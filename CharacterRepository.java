package com.amari.character_api;

 import org.springframework.data.jpa.repository.JpaRepository;
     import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long>{
    List<Character> findByNameContaining(String name);

    List<Character> findByUniverse(String universe);

}
