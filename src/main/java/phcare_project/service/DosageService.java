package phcare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phcare_project.dto.DosageDto;
import phcare_project.dto.DrugDto;
import phcare_project.entity.Dosage;
import phcare_project.repository.DosageRepository;

@Service
public class DosageService {

    @Autowired
    private DosageRepository dosageRepository;
    public String addNewDosage(DosageDto dosageDto) {
        Dosage newDosage = new Dosage();
        newDosage.setName(dosageDto.getName());
        newDosage.setSubstance_id(dosageDto.getSubstance_id());
        newDosage.setDosage_amount(dosageDto.getDosage_amount());
        dosageRepository.save(newDosage);
        return "Saved";
    }
}
