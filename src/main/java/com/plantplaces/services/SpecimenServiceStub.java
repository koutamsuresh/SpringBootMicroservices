package com.plantplaces.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.PlantDTO;
import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {
	@Override
	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenID(43);
		specimenDTO.setLatitude("39.74");
		specimenDTO.setLongitude("-84.51");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		return specimenDTO;
	}

	@Override
	public void save(SpecimenDTO specimenDTO) {

	}

	@Override
	public List<PlantDTO> fetchPlants(String searchterm) {
		List<PlantDTO> matchingPlants = new ArrayList<PlantDTO>();
		if (searchterm.contains("edbud") || searchterm.contains("Cercis")) {
			PlantDTO plantDTO = new PlantDTO();
			plantDTO.setGenus("Cercis");
			plantDTO.setCommon("Eastern Redbud");
			plantDTO.setSpecies("Eastern Redbud");
			matchingPlants.add(plantDTO);
		}
		return matchingPlants;
	}

}
