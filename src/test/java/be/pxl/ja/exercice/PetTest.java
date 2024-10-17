package be.pxl.ja.exercice;

import be.pxl.ja.exercise.Pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PetTest {
    @Test
    public void creatingAPetWithEnergyBelowZeroReturnsAPetWithEnergyZero() {
        // ARRANGE
        // ACT
        Pet pet = new Pet(-20);
        // ASSERT
        Assertions.assertEquals(0, pet.getEnergy());
    }
}