package phcare_project.dto;

public class UserDto {
    private String firstname;
    private String lastname;

    private String email;
    private int pwz_number;
    private String city;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPwz_number() {
        return pwz_number;
    }

    public void setPwz_number(int pwz_number) {
        this.pwz_number = pwz_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
