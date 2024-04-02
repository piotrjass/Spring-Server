package phcare_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "description")
public class Drug {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "time")
    private String time;

    @Column(name = "max_dosage")
    private Integer maxDosage;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "meal")
    private String meal;

    @Column(name = "effect")
    private String effect;

    @Column(name = "mechanism")
    private String mechanism;

    @Column(name = "indication")
    private String indication;

    @Column(name = "contraindication")
    private String contraindication;

    @Column(name = "form")
    private String form;

    @Column(name="synonym")
    private String synonym;

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getContraindication() {
        return contraindication;
    }

    public void setContraindication(String contraindication) {
        this.contraindication = contraindication;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMaxDosage() {
        return maxDosage;
    }

    public void setMaxDosage(int maxDosage) {
        this.maxDosage = maxDosage;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", maxDosage=" + maxDosage +
                ", dosage='" + dosage + '\'' +
                ", meal='" + meal + '\'' +
                ", effect='" + effect + '\'' +
                ", mechanism='" + mechanism + '\'' +
                ", indication='" + indication + '\'' +
                ", contraindication='" + contraindication + '\'' +
                ", form='" + form + '\'' +
                ", synonym='" + synonym + '\'' +
                '}';
    }

}
