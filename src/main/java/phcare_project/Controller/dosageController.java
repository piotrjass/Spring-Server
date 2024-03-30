package phcare_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import phcare_project.dto.DosageDto;
import phcare_project.repository.DosageRepository;
import phcare_project.service.DosageService;
@Controller
@RequestMapping("/dosage")
public class dosageController {
    @Autowired
    private DosageRepository dosageRepository;
    @Autowired
    private DosageService dosageService;

    @PostMapping("/add")
    public @ResponseBody String addNewDrugSubstance(@RequestBody DosageDto dosageDto){
        return dosageService.addNewDosage(dosageDto);
    }
}
