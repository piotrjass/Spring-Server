package phcare_project.dto;

public class DrugDto {
    private String synonyms;
    private String partOfADay;
    private String nameOfaDrug;
    private int maxDosage;
    private String indications;
    private String groupName;
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
        return nameOfaDrug;
    }

    public void setName(String name) {
        this.nameOfaDrug = name;
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
