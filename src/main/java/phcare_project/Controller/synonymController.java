package phcare_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import phcare_project.dto.SynonymDto;
import phcare_project.entity.Product;
import phcare_project.entity.Synonym;
import phcare_project.repository.synonymsRepository;
import phcare_project.service.SynonymService;

@Controller
@RequestMapping("/synonym")
public class synonymController {
    @Autowired
    private SynonymService synonymService;
    @Autowired
    private synonymsRepository synonymsRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Synonym> getAllProducts() {
        return synonymsRepository.findAll();
    }
    @PostMapping("/add")
    public @ResponseBody String addNewSynonym(@RequestBody SynonymDto synonymDto){
        return synonymService.addNewSynonym(synonymDto);
    }
}
