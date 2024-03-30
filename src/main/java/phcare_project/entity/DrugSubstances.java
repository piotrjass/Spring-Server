package phcare_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "drugs")
public class DrugSubstances {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;


    @Column(name = "name")
    private String name;
    @Column(name = "substance_id")
    private Integer substance_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSubstance_id() {
        return substance_id;
    }

    public void setSubstance_id(int substance_id) {
        this.substance_id = substance_id;
    }
}
