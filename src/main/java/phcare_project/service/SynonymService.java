package phcare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phcare_project.dto.SynonymDto;
import phcare_project.entity.Synonym;
import phcare_project.repository.synonymsRepository;

@Service
public class SynonymService {
    @Autowired
    private synonymsRepository drugSubstancesRepository;


    public String addNewSynonym(SynonymDto synonymDto){
        Synonym newSynonym = new Synonym();
        newSynonym.setName(synonymDto.getName());
        newSynonym.setSynonym1(synonymDto.getSynonym1());
        newSynonym.setSynonym2(synonymDto.getSynonym2());
        newSynonym.setSynonym3(synonymDto.getSynonym3());
        newSynonym.setSynonym4(synonymDto.getSynonym4());
        newSynonym.setSynonym5(synonymDto.getSynonym5());
        return "Saved! /Service";
    }
}
