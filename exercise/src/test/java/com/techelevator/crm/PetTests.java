package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {

    @Test
    public void does_string_match() {
        List<String> list = new ArrayList<>();
        list.add("Rabies");
        list.add("Distemper");
        list.add("Parvo");
        Pet pet = new Pet("fido", "austalian shepherd");
        pet.setVaccinations(list);

        boolean actual = pet.listVaccinations().equals("Rabies, Distemper, Parvo");

        Assert.assertTrue("Should return true", actual);
    }
}
