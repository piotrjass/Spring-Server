package phcare_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import phcare_project.dto.DiseaseDto;
import phcare_project.repository.DiseaseRepository;
import phcare_project.service.DiseaseService;

@Controller
@RequestMapping(path="/disease")
public class diseaseController {
    @Autowired
    private DiseaseRepository diseaseRepository;
    @Autowired
    private DiseaseService diseaseService;


    @PostMapping(path="/add")
    public @ResponseBody String addNewDisease(@RequestBody DiseaseDto diseaseDto) {
        return diseaseService.addNewDisease(diseaseDto);

    }
//    @PostMapping(path="/add")
//    public @ResponseBody String addNewDrug(@RequestBody DiseaseDto DiseaseDTO) {
//        Disease newDisease =  new Disease();
//        newDisease.setName(DiseaseDTO.getName());
//        newDisease.setATC(DiseaseDTO.getATC());
//        newDisease.setChronic(DiseaseDTO.getChronic());
//
//        diseaseRepository.save(newDisease);
//        return "Saved";}




}
