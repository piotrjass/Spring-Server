package phcare_project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "drugs")
public class Drug {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name = "synonims")
    private String synonyms;
    @Column(name = "partOfADay")
    private String partOfADay;
    @Column(name = "name")
    private String name;
    @Column(name = "maxDosage")
    private int maxDosage;
    @Column(name = "indications")
    private String indications;
    @Column(name = "groupName")
    private String group;
    @Column(name = "dosage")

    private String dosage;

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public String getPartOfADay() {
        return partOfADay;
    }

    public void setPartOfADay(String partOfADay) {
        this.partOfADay = partOfADay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDosage() {
        return maxDosage;
    }

    public void setMaxDosage(int maxDosage) {
        this.maxDosage = maxDosage;
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }

    public String getGroup() {
        return group;
    }

    public void setGroupName(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
