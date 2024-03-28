package phcare_project.dao;

public interface DrugSubstancesDao {

    DrugSubstancesDao findById(Long id);
    void extractSubstances(Long id);
    void save(DrugSubstancesDao drugSubstancesDao);
    void update(DrugSubstancesDao drugSubstancesDao);
    void delete(DrugSubstancesDao drugSubstancesDao);
}
