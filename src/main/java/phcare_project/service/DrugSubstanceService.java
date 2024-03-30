package phcare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phcare_project.dto.SynonymDto;
import phcare_project.entity.DrugSubstances;
import phcare_project.repository.synonymsRepository;

@Service
public class DrugSubstanceService {
    @Autowired
    private synonymsRepository drugSubstancesRepository;


    public String addNewDrugSubstance(SynonymDto drugSubstancesDto){
        DrugSubstances newDrugSubstance = new DrugSubstances();
        newDrugSubstance.setName(drugSubstancesDto.getName());
        drugSubstancesRepository.save(newDrugSubstance);
        return "Saved! /Service";
    }
}
