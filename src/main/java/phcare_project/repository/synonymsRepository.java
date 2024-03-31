package phcare_project.repository;

import org.springframework.data.repository.CrudRepository;
import phcare_project.entity.Synonym;

public interface synonymsRepository extends CrudRepository<Synonym, Integer> {
}
