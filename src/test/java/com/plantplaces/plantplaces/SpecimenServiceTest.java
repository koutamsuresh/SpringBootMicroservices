package com.plantplaces.plantplaces;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.plantplaces.dto.PlantDTO;
import com.plantplaces.services.ISpecimenService;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpecimenServiceTest {
	
	@Autowired
	ISpecimenService specimenService;
	List<PlantDTO> plants; 
	
	@Test
	public void fetchPlants_validateNoResultsForJunkData() {
		givenUserIsLoggedInToMyPlantDairy();
		whenTheUserSearchesForJunk();
		thenMyPlantDairyReturnsZeroResults();
	}

	private void givenUserIsLoggedInToMyPlantDairy() {
		
	}

	private void whenTheUserSearchesForJunk() {
		plants = specimenService.fetchPlants("dajsbdjsdbsjdbs");
	}

	private void thenMyPlantDairyReturnsZeroResults() {
		assertEquals("number of plants returned", 0,plants.size());
		
	}

}
