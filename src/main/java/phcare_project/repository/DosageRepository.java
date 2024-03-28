package phcare_project.repository;

import org.springframework.data.repository.CrudRepository;
import phcare_project.entity.Dosage;

public interface DosageRepository extends CrudRepository<Dosage, Integer> {
}
