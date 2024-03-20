package phcare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phcare_project.dto.DrugDto;
import phcare_project.entity.Drug;
import phcare_project.repository.DrugRepository;
@Service
public class DrugService {

    @Autowired
    private DrugRepository drugRepository;

    public String addNewDrug(DrugDto drugDto) {
        Drug newDrug = new Drug();
        newDrug.setSynonyms(drugDto.getSynonyms());
        newDrug.setPartOfADay(drugDto.getPartOfADay());
        newDrug.setName(drugDto.getName());
        newDrug.setMaxDosage(drugDto.getMaxDosage());
        newDrug.setIndications(drugDto.getIndications());
        newDrug.setDosage(drugDto.getDosage());
        drugRepository.save(newDrug);
        return "Saved";
    }
}
