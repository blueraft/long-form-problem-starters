package model;

import model.pets.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PetStore {


    private HashMap<String,ArrayList> animals = new HashMap<>();
    //MODIFIES: this
    //EFFECTS: adds p to the petstore
    public void addPet(Pet p){
        ArrayList<Pet> pets = animals.get(p.getSpecies());
        if (pets==null) {
            pets = new ArrayList<>();
        }
        pets.add(p);
        animals.put(p.getSpecies(), pets);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PetStore)) return false;

        PetStore petStore = (PetStore) o;

        return animals != null ? animals.equals(petStore.animals) : petStore.animals == null;
    }

    @Override
    public int hashCode() {
        return animals != null ? animals.hashCode() : 0;
    }

    //EFFECTS: finds a pet matching this species and color, if it exists in the store
    public Pet findMatchingPet(String species, String color){
        ArrayList<Pet> pets = animals.get(species);

        if (pets==null){
            return null;
        }

        Pet p = new Pet(species, color, 0.00);

        if (pets.contains(p)){
            int i = pets.indexOf(p);
            return pets.get(i);
        }
        return null;
    }

}
