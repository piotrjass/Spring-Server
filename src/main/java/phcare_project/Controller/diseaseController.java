package phcare_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import phcare_project.dto.DiseaseDto;
import phcare_project.entity.Disease;
import phcare_project.entity.Drug;
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

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }


}
