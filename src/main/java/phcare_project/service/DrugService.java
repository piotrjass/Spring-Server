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

    public Drug getDrugByActiveIngredient(String activeIngredient) {

        return drugRepository.findByName(activeIngredient);
    }
    public String addNewDrug(DrugDto drugDto) {
        Drug newDrug = new Drug();
        newDrug.setName(drugDto.getName());
        newDrug.setTime(drugDto.getTime());
        newDrug.setMaxDosage(drugDto.getMaxDosage());
        newDrug.setSynonym(drugDto.getSynonym());
        newDrug.setDosage(drugDto.getDosage());
        newDrug.setMeal(drugDto.getMeal());
        newDrug.setEffect(drugDto.getEffect());
        newDrug.setMechanism(drugDto.getMechanism());
        newDrug.setIndication(drugDto.getIndication());
        newDrug.setContraindication(drugDto.getContraindication());
        newDrug.setForm(drugDto.getForm());

        drugRepository.save(newDrug);
        return "Saved";
    }
}
