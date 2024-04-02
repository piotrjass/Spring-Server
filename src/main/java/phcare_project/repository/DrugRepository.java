package phcare_project.repository;

import org.springframework.data.repository.CrudRepository;
import phcare_project.entity.Drug;


public interface DrugRepository  extends CrudRepository<Drug, Integer> {
    Drug findByName(String name);
}
