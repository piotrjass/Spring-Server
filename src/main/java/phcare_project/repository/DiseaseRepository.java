package phcare_project.repository;

import org.springframework.data.repository.CrudRepository;
import phcare_project.entity.Disease;


public interface DiseaseRepository  extends CrudRepository<Disease, Integer> {
}
