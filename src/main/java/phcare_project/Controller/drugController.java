package phcare_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import phcare_project.dto.DrugDto;
import phcare_project.entity.Disease;
import phcare_project.entity.Drug;
import phcare_project.entity.User;
import phcare_project.repository.DrugRepository;
import phcare_project.service.DrugService;

@Controller
@RequestMapping(path="/drug")
public class drugController {
@Autowired
    private DrugRepository drugRepository;
    @Autowired
    private DrugService drugService;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Drug> getAllDrugs() {
        return drugRepository.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewDrug(@RequestBody DrugDto drugDTO) {
        return drugService.addNewDrug(drugDTO);
    }


}
