package phcare_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import phcare_project.dto.DrugSubstancesDto;
import phcare_project.entity.DrugSubstances;
import phcare_project.repository.DrugSubstancesRepository;
import phcare_project.service.DrugSubstanceService;

@Controller
@RequestMapping("/drugsubstances")
public class drugSubstancesController {
    @Autowired
    private DrugSubstanceService drugSubstanceService;
    @Autowired
    private DrugSubstancesRepository drugSubstancesRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<DrugSubstances> getAllDrugSubstances() {
        return drugSubstancesRepository.findAll();
    }
    @PostMapping("/add")
    public @ResponseBody String addNewDrugSubstance(@RequestBody DrugSubstancesDto drugSubstancesDto){
        return drugSubstanceService.addNewDrugSubstance(drugSubstancesDto);
    }
}
