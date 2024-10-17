package be.pxl.ja.exercise;

import java.util.Arrays;
import java.util.List;

public class Pet {
    private static final List<String> HARMFUL_FOOD = Arrays.asList("chocolate", "cucumber");
    private int energy;

    public Pet(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void feed(String food) throws WrongFoodException {
        if (HARMFUL_FOOD.contains(food.toLowerCase())) {
            throw new WrongFoodException("You cannot give your pet " + food);
        }
        energy += 20;
    }

    public void play() throws PetTiredException {
        if (energy < 20) {
            throw new PetTiredException("The pet is too tired to play");
        }
    }

    @Override
    public String toString() {
        return "Pet's energy level: " + energy;
    }
}