package phcare_project.dto;

public class DrugSubstancesDto {
    private int substance_id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubstance_id() {
        return substance_id;
    }

    public void setSubstance_id(int substance_id) {
        this.substance_id = substance_id;
    }
}
