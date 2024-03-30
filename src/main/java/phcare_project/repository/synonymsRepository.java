package phcare_project.repository;

import org.springframework.data.repository.CrudRepository;
import phcare_project.entity.DrugSubstances;

public interface synonymsRepository extends CrudRepository<DrugSubstances, Integer> {
}
