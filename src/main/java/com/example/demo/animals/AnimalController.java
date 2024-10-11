package com.example.demo.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/{animalId}")
    public Animal getAnimalById(@PathVariable int animalId) {
        return animalService.getAnimalById(animalId);
    }

    @PostMapping("/new")
    public void addNewAnimal(@RequestBody Animal animal) {
        animalService.addNewAnimal(animal);
    }

    @PutMapping("/update/{animalId}")
    public void updateAnimal(@PathVariable int animalId, @RequestBody Animal animal) {
        animalService.updateAnimal(animalId, animal);
    }

    @DeleteMapping("/delete/{animalId}")
    public void deleteAnimal(@PathVariable int animalId) {
        animalService.deleteAnimalById(animalId);
    }

    @GetMapping("/species")
    public List<Animal> getAnimalsBySpecies(@RequestParam String species) {
        return animalService.getAnimalsBySpecies(species);
    }

    @GetMapping("/search")
    public List<Animal> getAnimalsByNameContains(@RequestParam String name) {
        return animalService.getAnimalsByNameContains(name);
    }
}
