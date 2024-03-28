package phcare_project.dto;

public class DosageDto {

    private String name;
    private int product_id;
    private int substance_id;
    private int dosage_amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getSubstance_id() {
        return substance_id;
    }

    public void setSubstance_id(int substance_id) {
        this.substance_id = substance_id;
    }

    public int getDosage_amount() {
        return dosage_amount;
    }

    public void setDosage_amount(int dosage_amount) {
        this.dosage_amount = dosage_amount;
    }
}
