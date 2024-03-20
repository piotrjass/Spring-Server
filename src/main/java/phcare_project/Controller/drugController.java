package phcare_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import phcare_project.dto.DrugDto;
import phcare_project.entity.Drug;
import phcare_project.entity.User;
import phcare_project.repository.DrugRepository;

@Controller
@RequestMapping(path="/drug")
public class drugController {
@Autowired
    private DrugRepository drugRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Drug> getAllDrugs() {
        return drugRepository.findAll();
    }
@PostMapping(path="/add")
public @ResponseBody String addNewDrug(@RequestBody DrugDto drugDTO) {
    Drug newDrug = new Drug();
    newDrug.setName(drugDTO.getName());
    newDrug.setMaxDosage(drugDTO.getMaxDosage());
    drugRepository.save(newDrug);
    return "Saved";}

}
