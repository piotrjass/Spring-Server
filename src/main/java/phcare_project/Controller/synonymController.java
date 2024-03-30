package phcare_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import phcare_project.dto.SynonymDto;
import phcare_project.entity.DrugSubstances;
import phcare_project.entity.Synonym;
import phcare_project.repository.synonymsRepository;
import phcare_project.service.DrugSubstanceService;

@Controller
@RequestMapping("/drugsubstances")
public class synonymController {
    @Autowired
    private DrugSubstanceService drugSubstanceService;
    @Autowired
    private synonymsRepository drugSubstancesRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Synonym> getAllDrugSubstances() {
        return synonymsRepository.findAll();
    }
    @PostMapping("/add")
    public @ResponseBody String addNewDrugSubstance(@RequestBody SynonymDto drugSubstancesDto){
        return drugSubstanceService.addNewDrugSubstance(drugSubstancesDto);
    }
}
