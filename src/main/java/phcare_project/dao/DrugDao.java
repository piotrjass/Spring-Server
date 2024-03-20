package phcare_project.dao;

import phcare_project.entity.Drug;

public interface DrugDao {
    Drug findById(Long id);
    void save(Drug user);
    void update(Drug user);
    void delete(Drug user);
}
