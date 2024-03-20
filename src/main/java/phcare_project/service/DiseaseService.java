package phcare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phcare_project.dto.DiseaseDto;
import phcare_project.entity.Disease;
import phcare_project.repository.DiseaseRepository;
@Service
public class DiseaseService {
    @Autowired
    private DiseaseRepository diseaseRepository;

    public String addNewDisease(DiseaseDto diseaseDto) {
        Disease newDisease = new Disease();
        newDisease.setName(diseaseDto.getName());

        diseaseRepository.save(newDisease);
        return "Saved";
    }
}
