package fr.tse.fisa3de.yves;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FridgeTest {
    Fridge theFridge;

    @BeforeEach
    public void initInstances() {
        theFridge = new Fridge();
    }

    @org.junit.jupiter.api.Test
    void testAddFoodstuff() {
        Foodstuff l_tempFood = new Foodstuff("beurk");
        theFridge.addFoodstuff(l_tempFood);

        List<Foodstuff> allFoodStuff = theFridge.getAllFoodstuff();
        System.out.println("Size of List : " + allFoodStuff.size());
        assertEquals(1, allFoodStuff.size());
        if (l_tempFood == allFoodStuff.get(0))
            System.out.println(l_tempFood + " = " + allFoodStuff.get(0));
        else
            System.out.println(l_tempFood + " != " + allFoodStuff.get(0));
        assertEquals(l_tempFood, allFoodStuff.get(0));
    }

    @org.junit.jupiter.api.Test
    void testRemoveFoodStuffThatNotExist() {
        Foodstuff l_tempFood = new Foodstuff("beurk");
        Foodstuff l_tempFood2 = new Foodstuff("Mmmmm");

        theFridge.addFoodstuff(l_tempFood);
        theFridge.addFoodstuff(l_tempFood2);

        assertTrue(theFridge.removeFoodstuff(l_tempFood2));
        assertEquals(1, theFridge.getAllFoodstuff().size());
    }
}