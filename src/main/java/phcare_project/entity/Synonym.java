package phcare_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "synonyms")
public class Synonym {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;


    @Column(name = "name")
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
