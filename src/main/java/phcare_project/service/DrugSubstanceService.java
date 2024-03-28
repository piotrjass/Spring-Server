package phcare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phcare_project.dto.DrugSubstancesDto;
import phcare_project.entity.DrugSubstances;
import phcare_project.repository.DrugSubstancesRepository;

@Service
public class DrugSubstanceService {
    @Autowired
    private DrugSubstancesRepository drugSubstancesRepository;
    public String addNewDrugSubstance(DrugSubstancesDto drugSubstancesDto){
        DrugSubstances newDrugSubstance = new DrugSubstances();
        newDrugSubstance.setSubstance_id(drugSubstancesDto.getSubstance_id());
        newDrugSubstance.setName(drugSubstancesDto.getName());
        drugSubstancesRepository.save(newDrugSubstance);
        return "Saved!";
    }
}
