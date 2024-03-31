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
    @Column(name = "synonym1")
    private String synonym1;
    @Column(name = "synonym2")
    private String synonym2;
    @Column(name = "synonym3")
    private String synonym3;
    @Column(name = "synonym4")
    private String synonym4;
    @Column(name = "synonym5")
    private String synonym5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSynonym1() {
        return synonym1;
    }

    public void setSynonym1(String synonym1) {
        this.synonym1 = synonym1;
    }

    public String getSynonym2() {
        return synonym2;
    }

    public void setSynonym2(String synonym2) {
        this.synonym2 = synonym2;
    }

    public String getSynonym3() {
        return synonym3;
    }

    public void setSynonym3(String synonym3) {
        this.synonym3 = synonym3;
    }

    public String getSynonym4() {
        return synonym4;
    }

    public void setSynonym4(String synonym4) {
        this.synonym4 = synonym4;
    }

    public String getSynonym5() {
        return synonym5;
    }

    public void setSynonym5(String synonym5) {
        this.synonym5 = synonym5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
